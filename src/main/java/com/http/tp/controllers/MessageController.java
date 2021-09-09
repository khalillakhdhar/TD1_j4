package com.http.tp.controllers;

import java.util.List;

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

import com.http.tp.classes.Messages;

@RestController
@RequestMapping("Message")

public class MessageController {
@Autowired
MessageService messageService;
	@GetMapping("/{emetteur}")
public List<Messages> getmyMessages(@PathVariable int emetteur)
{
		return messageService.getMessagesByEmetteur(emetteur);
	
}
@PostMapping("/{emetteur}")
public Messages sendMessage(@PathVariable int emetteur,@Valid @RequestBody Messages message)
{
return messageService.sendMessage(message, emetteur);	
}
@DeleteMapping("/{messageId}")
public ResponseEntity<?> deleteMyMessage(@PathVariable int messageId)
{
return messageService.deleteMessage(messageId);	
}
}
