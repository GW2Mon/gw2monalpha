package org.GW2Mon.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WeaponType {
	private int Id, Handling, Aquantic;
	private String NameGer, NameEng;

	public WeaponType(int id, String nameGer, String nameEng, int handling,
			int aquantic) {
		this.setId(id);
		this.setNameEng(nameEng);
		this.setNameGer(nameGer);
		this.setHandling(handling);
		this.setAquantic(aquantic);
	}

	@Column(nullable=false)
	public int getHandling() {
		return Handling;
	}

	public void setHandling(int handling) {
		Handling = handling;
	}

	@Column(nullable=false)
	public int getAquantic() {
		return Aquantic;
	}

	public void setAquantic(int aquantic) {
		Aquantic = aquantic;
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
