package com.pennywise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.pennywise.model.Drinks;

@RestController(value = "drinkController")
@RequestMapping(value = "/drink")
public class DrinkController {

	
	private static RestTemplate restTemplate;
	
	@Autowired
	public void setRestTemplate(RestTemplate restTemplate) {
		DrinkController.restTemplate = restTemplate;
	}
	

	
	@RequestMapping(value="/randomDrink")
	public Drinks getRandomDrink(){
		Drinks retrievedDrink = DrinkController.restTemplate.getForObject(
				"https://www.thecocktaildb.com/api/json/v1/1/random.php",
				Drinks.class);
		return retrievedDrink;
	}
}
