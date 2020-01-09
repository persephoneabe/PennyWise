package com.pennywise.controller;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "loginController")
public class LoginController {

	@GetMapping(value="/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public void getLogin() {
		System.out.println("Loggin endpoint called");
	}
	
	
}
