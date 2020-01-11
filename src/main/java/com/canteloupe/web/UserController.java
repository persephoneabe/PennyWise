package com.canteloupe.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.canteloupe.model.User;
import com.canteloupe.service.UserService;

@RestController(value = "userController")
@RequestMapping(value = "/user")
public class UserController {

	private static UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		UserController.userService = userService;
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/allUsers", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getAllUser() {
		return UserController.userService.getAllUsers();
	}
	
	@GetMapping(value = "one/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public User getUserByUserId(@PathVariable int id) {
		return UserController.userService.getUserById(id);
	}
	
	@GetMapping(value = "username/{username}", produces = MediaType.APPLICATION_JSON_VALUE)
	public User getUserByUserame(@PathVariable String username) {
		return UserController.userService.getUserByUsername(username);
	}
}
