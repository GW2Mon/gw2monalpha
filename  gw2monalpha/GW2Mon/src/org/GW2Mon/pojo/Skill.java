package org.GW2Mon.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Skill {

	private int Id, Handling;
	private Skilltype Skilltype;
	private WeaponType WeaponType;
	private String NameGer, NameEng;

	public Skill(int id, String nameGer, String nameEng, Skilltype skilltype,
			int handling, WeaponType weapontype) {
		this.setId(id);
		this.setNameGer(nameGer);
		this.setNameEng(nameEng);
		this.setSkilltype(skilltype);
		this.setHandling(handling);
		this.setWeaponType(weapontype);
	}

	@Id
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	@Column(nullable=false)
	@ManyToOne(targetEntity=Skilltype.class)
	public Skilltype getSkilltype() {
		return Skilltype;
	}

	public void setSkilltype(Skilltype skilltype) {
		Skilltype = skilltype;
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

	@Column(nullable=false)
	public int getHandling() {
		return Handling;
	}

	public void setHandling(int handling) {
		Handling = handling;
	}

	@Column(nullable=false)
	@ManyToOne(targetEntity=WeaponType.class)
	public WeaponType getWeaponType() {
		return WeaponType;
	}

	public void setWeaponType(WeaponType weaponType) {
		WeaponType = weaponType;
	}

}
