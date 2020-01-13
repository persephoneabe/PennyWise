package com.pennywise.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IngredientValue {

	@JsonProperty("strIngredient")
	private String strIngredient;
	
	@JsonProperty("strType")
	private String strType;
	
	@JsonProperty("strAlcohol")
	private String strAlcohol;
	
	@JsonProperty("strABV")
	private String strABV;

	public IngredientValue() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
