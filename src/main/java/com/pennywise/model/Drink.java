package com.pennywise.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Drink {
	
	@JsonProperty("strDrink")
	String drink ;

	public Drink() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Drink(String drink) {
		super();
		this.drink = drink;
	}
	
	

}
