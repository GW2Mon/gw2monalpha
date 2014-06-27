package org.GW2Mon.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ItemVzb2 {

	private int Id;
	private ItemVzb ItemVzb;
	private ItemVzb1 ItemVzb1;
	private String NameGer, NameEng;

	public ItemVzb2(int id, String nameGer, String nameEng, ItemVzb itemVzb,
			ItemVzb1 ItemVzb1) {
		this.setId(id);
		this.setNameGer(nameGer);
		this.setNameEng(nameEng);
		this.setItemVzb(itemVzb);
		this.setItemVzb1(ItemVzb1);
	}

	@ManyToOne(targetEntity=ItemVzb.class)
	public ItemVzb getItemVzb() {
		return ItemVzb;
	}

	public void setItemVzb(org.GW2Mon.pojo.ItemVzb itemVzb) {
		ItemVzb = itemVzb;
	}

	@ManyToOne(targetEntity=ItemVzb1.class)
	public ItemVzb1 getItemVzb1() {
		return ItemVzb1;
	}

	public void setItemVzb1(org.GW2Mon.pojo.ItemVzb1 itemVzb1) {
		ItemVzb1 = itemVzb1;
	}

	@Id
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

}
