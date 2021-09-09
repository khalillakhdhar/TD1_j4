package com.http.tp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.http.tp.classes.User;
import com.http.tp.repository.UserRepository;

@Service
public class UserService {
	
@Autowired
UserRepository userRepository;

public List<User> getAllUsers()
{
return userRepository.findAll();	
}
public User addOneUser(User us)
{
return userRepository.save(us);	
}
public Optional<User> getUserById(int iduser)
{
return userRepository.findById(iduser);	
}
public ResponseEntity<?> deleteUser(int userId)
{
userRepository.deleteById(userId);
return ResponseEntity.ok().build();
}
}
