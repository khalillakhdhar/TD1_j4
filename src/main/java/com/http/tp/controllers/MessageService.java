package com.http.tp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.http.tp.classes.Messages;
import com.http.tp.classes.User;
import com.http.tp.exception.RessourceNotFoundException;
import com.http.tp.repository.MessageRepository;
import com.http.tp.repository.UserRepository;

@Service
public class MessageService {
@Autowired
MessageRepository messageRepository;
@Autowired
UserRepository userRepository;


public Messages sendMessage(Messages message,int userId)
{
	return userRepository.findById(userId).map(user->{message.setEmetteur(user);
	return messageRepository.save(message);
	}).orElseThrow(()-> new RessourceNotFoundException("Utilisateur "+ userId+" not found"));
}
public Optional<Messages> findMessageById(int id)
{
return messageRepository.findById(id);	
}
public ResponseEntity<?> deleteMessage(int messageId)
{
 messageRepository.deleteById(messageId);
 return ResponseEntity.ok().build();
}

}
