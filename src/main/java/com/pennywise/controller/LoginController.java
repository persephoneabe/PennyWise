package com.pennywise.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pennywise.Service.UserService;
import com.pennywise.model.User;


@RestController(value = "loginController")
@CrossOrigin
public class LoginController {
	
	private static UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		LoginController.userService = userService;
	}
	static User user = new User();

	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public User getLogin(@RequestParam("username") String username,@RequestParam("password") String  password) {
		
		user = LoginController.userService.getUserByUsername(username);
		
		return user;
		
		
		//check if user name is null
		//if(username.equals(null)) {
		//	System.out.println(username + "is null");
		//	return null;
		//}else {
		
			//search database by username from givin username
			//return LoginController.userService.getUserByUsername(username);
		
				//if password the password matches return user back to angular
//				if(user.getUserpassword().equals(password)) {
//					return user;
//					
//				}else { //if password doesn't match return null
//					System.out.println("password is null");
//					return null;
//				}
//			}
	
		}
	
}
	

