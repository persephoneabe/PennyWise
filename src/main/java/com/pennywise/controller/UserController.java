package com.pennywise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pennywise.Service.UserService;
import com.pennywise.model.Drinks;
import com.pennywise.model.User;

@RestController(value = "userController")
@RequestMapping(value = "/user")
public class UserController {
	
	static UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		UserController.userService = userService;
	}
	
//	@RequestMapping(value="/home", method=RequestMethod.GET)
//	public String index() {
//		return "index";
//	}
	
	@RequestMapping(value="/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getAllUser(){
		return UserController.userService.getAllUsers();
	}
	
	@RequestMapping(value="/name/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public User getByName(@PathVariable String name){
		return UserController.userService.getUserByUsername(name);
	}


}
