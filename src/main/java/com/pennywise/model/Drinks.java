package com.pennywise.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Drinks {

	@JsonProperty("drinks")
	List<DrinkValue> drinks;
	
	
	public Drinks() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	

	
	
	
}
