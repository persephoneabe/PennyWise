package com.canteloupe.web;

import javax.servlet.http.HttpSession;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.canteloupe.model.User;
import com.canteloupe.service.UserService;

@RestController(value = "loginController")
public class LoginController {

	private static UserService userService;
	
	//Just simple test
	@GetMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public void getLogin() {
		System.out.println("Login Successful.");
	}
	
//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public boolean login(@RequestParam("username") User user) {
//		if ()
//	}
	
//	@RequestMapping(value = { "/login" }, method = RequestMethod.POST)
//	public User login(@RequestParam("username") String username, @RequestParam("password") String password,
//			HttpSession session) {
//		System.out.println(username);//REMOVE BEFORE PRODUCTION
//		System.out.println(password);//REMOVE BEFORE PRODUCTION
//		User user = userService.login(username, password);
//		
//		if (user != null) {
//			session.setAttribute("USER", user);
//		} else {
//			return null;
//		}
//		return user;
//	}
	
//	@GetMapping("/logout")
//	public void logout(HttpSession session) {
//		session.invalidate();
//	}
}
