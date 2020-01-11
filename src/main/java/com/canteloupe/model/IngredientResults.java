package com.canteloupe.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IngredientResults {

	@JsonProperty("ingredients")
	private List<NestedIngredients> ingredients;

	public IngredientResults() {}
}
