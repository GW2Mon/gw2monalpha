package org.GW2Mon.dao;

import java.util.ArrayList;

import org.GW2Mon.model.DB;
import org.GW2Mon.pojo.Item;
import org.GW2Mon.pojo.Recipe;
import org.hibernate.Transaction;

public class RecipeDao {

	/**
	 * Returns Recipe with Id or Item param 
	 * corresponding on Type of param.
	 * @param param
	 * @return Recipe
	 */
	public Recipe getRecipe(Object param) {
		Recipe recipe = null;
		DB db = new DB();
		if (param.getClass() == Integer.class)
			recipe = (Recipe) db.session.get(Recipe.class, (Integer) param);
		else if (param.getClass() == Item.class)
			recipe = (Recipe) db.session.createQuery("from" + Recipe.class
					+ " where ItemId='" + ((Item) param).getId() + "'");
		else
			System.out.println("Type of param not supported.");
		return recipe;
	}

	/**
	 * Returns all Recipes.
	 * 
	 * @return ArrayList< Recipe>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Recipe> getRecipes() {
		ArrayList<Recipe> arrayList = null;
		DB db = new DB();
		arrayList = (ArrayList<Recipe>) db.session.createQuery(
				"from " + Recipe.class).list();
		return arrayList;
	}
	
	/**
	 * Sets Recipe recipe.
	 * @param recipe
	 */
	public void setRecipe(Recipe recipe){
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			db.session.saveOrUpdate(recipe);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
	
	/**
	 * Sets all Recipes in ArrayList arrayList.
	 * @param arrayList
	 */
	public void setRecipes(ArrayList<Recipe> arrayList){
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			for (Recipe recipe : arrayList)
				db.session.saveOrUpdate(recipe);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
}
