package com.http.tp.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.http.tp.classes.User;


@RestController
@RequestMapping("User")
public class UserController {
@Autowired
UserService userService;
	
	
@GetMapping
public List<User> getUsers()
{
return 	userService.getAllUsers();

}
@PostMapping
public  User addUser(@Valid @RequestBody User user)
{
return userService.addOneUser(user);

}
@GetMapping("/{userId}")
public Optional<User> getOneUser(@PathVariable int userId)
{
return userService.getUserById(userId);	
}
@DeleteMapping("/{userId}")
public ResponseEntity<?> deleteOneUser(@PathVariable int userId)
{
return userService.deleteUser(userId);	
}
}
