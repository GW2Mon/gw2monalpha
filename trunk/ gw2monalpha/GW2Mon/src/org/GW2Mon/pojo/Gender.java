package org.GW2Mon.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Gender {

	private int Id;
	private String NameGer, NameEng;

	public Gender(int id, String nameGer, String nameEng) {
		this.setId(id);
		this.setNameGer(nameGer);
		this.setNameEng(nameEng);
	}

	public Gender() {
	}

	@Id
	public int getId() {
		return this.Id;
	}

	public void setId(int id) {
		this.Id = id;
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
