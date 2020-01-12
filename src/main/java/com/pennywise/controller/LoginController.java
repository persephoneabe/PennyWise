package com.pennywise.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pennywise.Service.UserService;
import com.pennywise.model.User;

@RestController(value = "loginController")
public class LoginController {
	
	UserService us = new UserService(); 
	User u = new User();

	@PostMapping(value="/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public User getLogin(@RequestParam("username") String username,@RequestParam("password") String password) {
			
		
			//search database by username from givin username
			u = us.getUserByUsername(username);
			
			//if username is null return null
			if(u.getUsername().equals(null)) {
				return null;
				
			}else { //if username is not null check the password
			
				//if password the password matches return user back to angular
				if(u.getUserpassword().equals(password)) {
					return u;
					
				}else { //if password doesn't match return null
					return null;
				}
			}
	
		
	}
	
	
}
