package com.pennywise.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pennywise.service.UserService;
import com.pennywise.model.User;


@RestController(value = "loginController")
@CrossOrigin
public class LoginController {
	
	UserService userService = new UserService(); 
	User user = null;

	
	@PostMapping(value="/login", produces=MediaType.APPLICATION_JSON_VALUE)
	public User getLogin(@RequestParam("username") String username, @RequestParam("password") String password) {
			
		//check if user name is null
		if(username.equals(null)) {
			System.out.println(username + "is null");
			return null;
		}else {
		
			//search database by username from givin username
			user = userService.getUserByUsername(username);
			
			
				//if password the password matches return user back to angular
				if(user.getUserpassword().equals(password)) {
					return user;
					
				}else { //if password doesn't match return null
					System.out.println("password is null");
					return null;
				}
			}
	
		}
	
}
	

