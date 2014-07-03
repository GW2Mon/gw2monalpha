package org.GW2Mon.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Craftingdiscipline_has_Recept {

	private CraftingDiscipline Craftingdiscipline;
	private Recipe Recept;

	public Craftingdiscipline_has_Recept(CraftingDiscipline craftdisc,
			Recipe recept) {
		this.setCraftingdiscipline(craftdisc);
		this.setRecept(recept);
	}

	@Id
	@ManyToOne(targetEntity = CraftingDiscipline.class)
	public CraftingDiscipline getCraftingdiscipline() {
		return Craftingdiscipline;
	}

	public void setCraftingdiscipline(CraftingDiscipline craftingdiscipline) {
		Craftingdiscipline = craftingdiscipline;
	}

	@Id
	@ManyToOne(targetEntity = Recipe.class)
	public Recipe getRecept() {
		return Recept;
	}

	public void setRecept(Recipe recept) {
		Recept = recept;
	}

}
