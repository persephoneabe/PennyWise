package com.pennywise.controllertest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.pennywise.controller.UserController;
import com.pennywise.model.User;
import com.pennywise.service.UserService;



//@ContextConfiguration(locations="classpath:testContext.xml")
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserControllerTest {
	
	//make a mock of user service
	@Mock
	private UserService userservice;
	
	//make a mock of the user controller
	@InjectMocks
	private UserController userController;

	//make a mock mvc
	private MockMvc mockMvc;
	
	//create a generic list of users 
	private List<User> user;
	
	
	@Before
	public void setUp() {
		//start mocks
		MockitoAnnotations.initMocks(this);
		
		//set the mock mvc to the contoller am setting
		mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
	
		//create mock data for array
		user = new ArrayList<>();
		
		user.add(new User(1,"Jerry","admin", "Jerry the Destroyer"));
		user.add(new User(2,"Tom","admin", "Tom the Cat"));
		user.add(new User(3,"Terry","admin", "Terry Terry"));
	
	}
	
	
	@Test
	public void testGetAllUsers() {
		Mockito.when(userservice.getAllUsers()).thenReturn(user);
		
		try {
			/*
			 * We are manually constructing a request and specifying what should happen
			 * when such a request is made.
			 */
			mockMvc.perform(get("/user/all").contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
			.andExpect(status().isOk()).andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
			.andDo(print()).andReturn();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
