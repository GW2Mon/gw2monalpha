package org.GW2Mon.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Recipe {

	private int Id, ItemAmount, Ingredient1Amount, Ingredient2Amount,
			Ingredient3Amount, Ingredient4Amount, Rating, ApiId;
	private CraftingDiscipline CraftDisc1, CraftDisc2, CraftDisc3;
	private Item Ingredient1Id, Ingredient2Id, Ingredient3Id, Ingredient4Id,
			ItemId;
	private String NameGer, NameEng;

	public Recipe(int id, String nameGer, String nameEng, CraftingDiscipline craftDisc1,
			CraftingDiscipline craftDisc2, CraftingDiscipline craftDisc3, Item ingredient1Id,
			int ingredient1Amount, Item ingredient2Id, int ingredient2Amount,
			Item ingredient3Id, int ingredient3Amount, Item ingredient4Id,
			int ingredient4Amount, Item itemId, int itemAmount, int rating,
			int apiId) {
		setId(id);
		setCraftDisc1(craftDisc1);
		setCraftDisc2(craftDisc2);
		setNameGer(nameGer);
		setNameEng(nameEng);
		setCraftDisc3(craftDisc3);
		setIngredient1Id(ingredient1Id);
		setIngredient1Amount(ingredient1Amount);
		setIngredient2Id(ingredient2Id);
		setIngredient2Amount(ingredient2Amount);
		setIngredient3Id(ingredient3Id);
		setIngredient3Amount(ingredient3Amount);
		setIngredient4Id(ingredient4Id);
		setIngredient4Amount(ingredient4Amount);
		setItemId(itemId);
		setItemAmount(itemAmount);
		setRating(rating);
		setApiId(apiId);
	}

	@Id
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	@Column(nullable = false)
	@ManyToOne(targetEntity=CraftingDiscipline.class)
	public CraftingDiscipline getCraftDisc1() {
		return CraftDisc1;
	}

	public void setCraftDisc1(CraftingDiscipline craftDisc1) {
		CraftDisc1 = craftDisc1;
	}

	@Column(nullable = false)
	@ManyToOne(targetEntity=CraftingDiscipline.class)
	public CraftingDiscipline getCraftDisc2() {
		return CraftDisc2;
	}

	public void setCraftDisc2(CraftingDiscipline craftDisc2) {
		CraftDisc2 = craftDisc2;
	}

	@Column(nullable = false)
	@ManyToOne(targetEntity=CraftingDiscipline.class)
	public CraftingDiscipline getCraftDisc3() {
		return CraftDisc3;
	}

	public void setCraftDisc3(CraftingDiscipline craftDisc3) {
		CraftDisc3 = craftDisc3;
	}

	@Column(nullable = false)
	@ManyToOne(targetEntity=Item.class)
	public Item getIngredient1Id() {
		return Ingredient1Id;
	}

	public void setIngredient1Id(Item ingredient1Id) {
		Ingredient1Id = ingredient1Id;
	}

	@ManyToOne(targetEntity=Item.class)
	public Item getIngredient2Id() {
		return Ingredient2Id;
	}

	public void setIngredient2Id(Item ingredient2Id) {
		Ingredient2Id = ingredient2Id;
	}

	@ManyToOne(targetEntity=Item.class)
	public Item getIngredient3Id() {
		return Ingredient3Id;
	}

	public void setIngredient3Id(Item ingredient3Id2) {
		Ingredient3Id = ingredient3Id2;
	}

	@ManyToOne(targetEntity=Item.class)
	public Item getIngredient4Id() {
		return Ingredient4Id;
	}

	public void setIngredient4Id(Item ingredient4Id2) {
		Ingredient4Id = ingredient4Id2;
	}

	@Column(nullable = false)
	@ManyToOne(targetEntity=Item.class)
	public Item getItemId() {
		return ItemId;
	}

	public void setItemId(Item itemId) {
		ItemId = itemId;
	}

	@Column(nullable = false)
	public int getApiId() {
		return ApiId;
	}

	public void setApiId(int apiId) {
		ApiId = apiId;
	}

	@Column(nullable = false)
	@ManyToOne(targetEntity=Item.class)
	public int getItemAmount() {
		return ItemAmount;
	}

	public void setItemAmount(int itemAmount) {
		ItemAmount = itemAmount;
	}

	@Column(nullable = false)
	public int getIngredient1Amount() {
		return Ingredient1Amount;
	}

	public void setIngredient1Amount(int ingredient1Amount) {
		Ingredient1Amount = ingredient1Amount;
	}

	public int getIngredient2Amount() {
		return Ingredient2Amount;
	}

	public void setIngredient2Amount(int ingredient2Amount) {
		Ingredient2Amount = ingredient2Amount;
	}

	public int getIngredient3Amount() {
		return Ingredient3Amount;
	}

	public void setIngredient3Amount(int ingredient3Amount) {
		Ingredient3Amount = ingredient3Amount;
	}

	public int getIngredient4Amount() {
		return Ingredient4Amount;
	}

	public void setIngredient4Amount(int ingredient4Amount) {
		Ingredient4Amount = ingredient4Amount;
	}

	public String getNameGer() {
		return NameGer;
	}

	public void setNameGer(String nameGer) {
		NameGer = nameGer;
	}

	public String getNameEng() {
		return NameEng;
	}

	public void setNameEng(String nameEng) {
		NameEng = nameEng;
	}

	@Column(nullable = false)
	public int getRating() {
		return Rating;
	}

	public void setRating(int rating) {
		Rating = rating;
	}

}
