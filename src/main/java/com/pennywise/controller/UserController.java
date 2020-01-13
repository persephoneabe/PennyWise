package com.pennywise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pennywise.model.User;
import com.pennywise.service.UserService;

@RestController(value = "userController")
@RequestMapping(value = "/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
//	@RequestMapping(value="/home", method=RequestMethod.GET)
//	public String index() {
//		return "index";
//	}
	
	@RequestMapping(value="/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getAllUser(){
		return this.userService.getAllUsers();
	}
	
	@RequestMapping(value="/name/{name}")
	public User getByName(@PathVariable String name){
		return this.userService.getUserByUsername(name);
	}

	@RequestMapping(value = "/new")
	public void createUser(User user) {
		this.userService.insertUser(user);
	}
}
