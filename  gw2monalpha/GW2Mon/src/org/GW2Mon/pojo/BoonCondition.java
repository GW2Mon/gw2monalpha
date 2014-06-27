package org.GW2Mon.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BoonCondition {

	private int Id;
	private Attribute Attribute;
	private String NameGer, NameEng, Wirkung;

	public BoonCondition(int id, String nameGer, String nameEng, Attribute attribute,
			String wirkung) {
		this.setId(id);
		this.setNameGer(nameGer);
		this.setNameEng(nameEng);
		this.setAttribute(attribute);
		this.setWirkung(wirkung);
	}

	@ManyToOne(targetEntity=Attribute.class)
	public Attribute getAttribute() {
		return Attribute;
	}

	public void setAttribute(Attribute attribute) {
		Attribute = attribute;
	}

	public String getWirkung() {
		return Wirkung;
	}

	public void setWirkung(String wirkung) {
		Wirkung = wirkung;
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
