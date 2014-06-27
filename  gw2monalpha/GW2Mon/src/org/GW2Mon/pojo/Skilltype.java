package org.GW2Mon.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Skilltype {

	private int Id, Handling;
	private WeaponType WeaponType;
	private Profession Profession;
	private String NameGer, NameEng;

	public Skilltype(int id, WeaponType weaponType, Profession profession, String nameGer,
			String nameEng, int handling) {
		this.setId(id);
		this.setWeaponType(weaponType);
		this.setProfession(profession);
		this.setNameGer(nameGer);
		this.setNameEng(nameEng);
		this.setHandling(handling);
	}

	@Id
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	@ManyToOne(targetEntity=Profession.class)
	public Profession getProfession() {
		return Profession;
	}

	public void setProfession(Profession profession) {
		Profession = profession;
	}

	@Column(nullable=false)
	public int getHandling() {
		return Handling;
	}

	public void setHandling(int handling) {
		Handling = handling;
	}

	@ManyToOne(targetEntity=WeaponType.class)
	public WeaponType getWeaponType() {
		return WeaponType;
	}

	public void setWeaponType(WeaponType weaponType) {
		WeaponType = weaponType;
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
