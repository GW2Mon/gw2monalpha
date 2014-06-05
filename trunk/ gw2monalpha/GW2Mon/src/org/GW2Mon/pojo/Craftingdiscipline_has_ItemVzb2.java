package org.GW2Mon.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Craftingdiscipline_has_ItemVzb2 {

	private CraftingDiscipline Craftingdiscipline;
	private ItemVzb2 ItemVzb2;

	public Craftingdiscipline_has_ItemVzb2(CraftingDiscipline craftdisc,ItemVzb2 itemvzb2) {
		this.setCraftingdiscipline(craftdisc);
		this.setItemVzb2(itemvzb2);
	}

	@Id
	@ManyToOne(targetEntity=CraftingDiscipline.class)
	public CraftingDiscipline getCraftingdiscipline() {
		return Craftingdiscipline;
	}

	public void setCraftingdiscipline(CraftingDiscipline craftingdiscipline) {
		Craftingdiscipline = craftingdiscipline;
	}

	@Id
	@ManyToOne(targetEntity=ItemVzb2.class)
	public ItemVzb2 getItemVzb2() {
		return ItemVzb2;
	}

	public void setItemVzb2(ItemVzb2 itemVzb2) {
		ItemVzb2 = itemVzb2;
	}

}
