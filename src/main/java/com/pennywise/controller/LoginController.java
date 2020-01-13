package com.pennywise.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pennywise.model.User;
import com.pennywise.service.UserService;


@RestController(value = "loginController")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

	public LoginController() {}

	@Autowired
	private UserService userService;

		public void setUserService(UserService userService) {
			this.userService = userService;
		}

	User user = null;

	@PostMapping(value="/login", produces=MediaType.APPLICATION_JSON_VALUE)
	public User getLogin(@RequestParam("username") String username,
			@RequestParam("password") String password, HttpSession session) {
		user = userService.getUserByUsername(username);
		session.setAttribute("USER", user);
		System.out.println(user);
		if(user.getUserpassword().equals(password)) {
			System.out.println("Inside 'if' -- " + user);
			return user;
		}
		else {
			System.out.println("Inside 'else' --" + user);
			return null;
		}	
	}
	
	@RequestMapping(value = "/new")
	public void createUser(User user) {
		this.userService.insertUser(user);
	}
}


