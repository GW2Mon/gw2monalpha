package org.GW2Mon.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ItemVzb1 {

	private int Id;
	private ItemVzb ItemVzb;
	private String NameGer, NameEng;

	public ItemVzb1(int id, String nameGer, String nameEng, ItemVzb itemVzb) {
		this.setId(id);
		this.setNameGer(nameGer);
		this.setNameEng(nameEng);
		this.setItemVzb(itemVzb);
	}

	@ManyToOne(targetEntity = ItemVzb.class)
	public org.GW2Mon.pojo.ItemVzb getItemVzb() {
		return ItemVzb;
	}

	public void setItemVzb(ItemVzb itemVzb) {
		ItemVzb = itemVzb;
	}

	@Id
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNameEng() {
		return NameEng;
	}

	public void setNameEng(String nameEng) {
		NameEng = nameEng;
	}

	public String getNameGer() {
		return NameGer;
	}

	public void setNameGer(String nameGer) {
		NameGer = nameGer;
	}

}
