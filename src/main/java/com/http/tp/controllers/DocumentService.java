package com.http.tp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.http.tp.repository.DocumentRepository;
import com.http.tp.repository.UserRepository;
import com.http.tp.classes.Document;
import com.http.tp.classes.User;
import com.http.tp.exception.RessourceNotFoundException;
@Service
public class DocumentService {
@Autowired
UserRepository userRepository;
@Autowired
DocumentRepository documentRepository;
public List<Document> getDocByUserId(int iduser)
{
	
return documentRepository.findByIdUser(iduser);
}
public Document addDocument(Document doc,int userId)
{
return userRepository.findById(userId).map(user->{ doc.setIdUser(user);
return documentRepository.save(doc);
}).orElseThrow(()-> new RessourceNotFoundException("user not found in "+userId));

}
public ResponseEntity<?> deleteDoc(int docId)
{
 documentRepository.deleteById(docId);
 return ResponseEntity.ok().build();
		 
}


}
