package org.GW2Mon.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Weightclass {

	private int Id;
	private String NameGer,NameEng;
	
	public Weightclass(int id,String nameGer,String nameEng){
		setId(id);
		setNameGer(nameGer);
		setNameEng(nameEng);
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

	@Id
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
}
