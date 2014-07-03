package org.GW2Mon.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Attribute {

	private int Id, Type;
	private String NameGer, NameEng, HintGer, HintEng;

	public Attribute(int id, int type, String nameGer, String nameEng,
			String hintGer, String hintEng) {
		this.Id = id;
		this.Type = type;
		this.NameEng = nameEng;
		this.NameGer = nameGer;
		this.HintGer = hintGer;
		this.HintEng = hintEng;
	}

	@Column(nullable = false)
	public int getType() {
		return Type;
	}

	public void setType(int type) {
		Type = type;
	}

	@Id
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getHintEng() {
		return HintEng;
	}

	public void setHintEng(String hintEng) {
		HintEng = hintEng;
	}

	public String getNameEng() {
		return NameEng;
	}

	public void setNameEng(String nameEng) {
		NameEng = nameEng;
	}

	public String getHintGer() {
		return HintGer;
	}

	public void setHintGer(String hintGer) {
		HintGer = hintGer;
	}

	public String getNameGer() {
		return NameGer;
	}

	public void setNameGer(String nameGer) {
		NameGer = nameGer;
	}

}
