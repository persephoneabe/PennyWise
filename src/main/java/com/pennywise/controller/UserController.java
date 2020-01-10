package com.pennywise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pennywise.Service.UserService;
import com.pennywise.model.User;

@RestController(value = "userController")
@RequestMapping(value = "/user")
public class UserController {
	
	private static UserService userService;
	
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

}
