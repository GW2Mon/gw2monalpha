package org.GW2Mon.service;

import java.util.ArrayList;

import org.GW2Mon.dao.RecipeDao;
import org.GW2Mon.pojo.Recipe;

public class RecipeService {

	private RecipeDao recipeDao = new RecipeDao();
	
	/**
	 * Saves all Recipes.
	 */
	public void saveRecipes(){
		recipeDao.setRecipes(recipeDao.getRecipes());
	}
	
	/**
	 * Saves Recipes in ArrayList arrayList.
	 * @param arrayList
	 */
	public void saveRecipes(ArrayList<Recipe> arrayList){
		recipeDao.setRecipes(arrayList);
	}
	
	/**
	 * Saves Recipe recipe.
	 * @param recipe
	 */
	public void saveRecipe(Recipe recipe){
		recipeDao.setRecipe(recipe);
	}
	
	/**
	 * Loads all Recipes.
	 * @return ArrayList< Recipe>
	 */
	public ArrayList<Recipe> loadRecipes(){
		return recipeDao.getRecipes();
	}
	
	/**
	 * Loads Recipe with Id or Item param
	 * corresponding on Type of param.
	 * @param param
	 * @return Recipe
	 */
	public Recipe loadRecipe(Object param){
		return recipeDao.getRecipe(param);
	}
}
