package com.canteloupe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NestedResults {
	
	@JsonProperty("idDrink")
	private int id;

	@JsonProperty("strDrink")
	private String name;
	
	@JsonProperty("strIngredient1")
	private String ingredient1;
	
	@JsonProperty("strIngredient2")
	private String ingredient2;
	
	@JsonProperty("strIngredient3")
	private String ingredient3;
	
	@JsonProperty("strIngredient4")
	private String ingredient4;
	
	@JsonProperty("strIngredient5")
	private String ingredient5;
	
//	@JsonProperty("strDrink")
//	private List<String> name;
//	
//	@JsonProperty("strIngredient1")
//	private List<String> ingredient1;
//	
//	@JsonProperty("strIngredient2")
//	private List<String> ingredient2;
//	
//	@JsonProperty("strIngredient3")
//	private List<String> ingredient3;
//	
//	@JsonProperty("strIngredient4")
//	private List<String> ingredient4;
//	
//	@JsonProperty("strIngredient5")
//	private List<String> ingredient5;

	public NestedResults() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIngredient1() {
		return ingredient1;
	}

	public void setIngredient1(String ingredient1) {
		this.ingredient1 = ingredient1;
	}

	public String getIngredient2() {
		return ingredient2;
	}

	public void setIngredient2(String ingredient2) {
		this.ingredient2 = ingredient2;
	}

	public String getIngredient3() {
		return ingredient3;
	}

	public void setIngredient3(String ingredient3) {
		this.ingredient3 = ingredient3;
	}

	public String getIngredient4() {
		return ingredient4;
	}

	public void setIngredient4(String ingredient4) {
		this.ingredient4 = ingredient4;
	}

	public String getIngredient5() {
		return ingredient5;
	}

	public void setIngredient5(String ingredient5) {
		this.ingredient5 = ingredient5;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "NestedResults [id=" + id + ", name=" + name + ", ingredient1=" + ingredient1 + ", ingredient2="
				+ ingredient2 + ", ingredient3=" + ingredient3 + ", ingredient4=" + ingredient4 + ", ingredient5="
				+ ingredient5 + "]";
	}
}
