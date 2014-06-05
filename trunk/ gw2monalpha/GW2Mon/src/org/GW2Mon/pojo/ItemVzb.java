package org.GW2Mon.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemVzb {

	private int Id;
	private String NameGer, NameEng;

	public ItemVzb(int id, String nameGer, String nameEng) {
		this.setId(id);
		this.setNameGer(nameGer);
		this.setNameEng(nameEng);
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
