package org.GW2Mon.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Profession_has_WeaponType {

	@Id
	private Profession Profession;
	private WeaponType WeaponType;

	public Profession_has_WeaponType(Profession profession,
			WeaponType weapontype) {
		this.setProfession(profession);
		this.setWeaponType(weapontype);
	}

	@ManyToOne(targetEntity = WeaponType.class)
	public WeaponType getWeaponType() {
		return WeaponType;
	}

	public void setWeaponType(WeaponType weaponType) {
		WeaponType = weaponType;
	}

	@ManyToOne(targetEntity = Profession.class)
	public Profession getProfession() {
		return Profession;
	}

	public void setProfession(Profession profession) {
		Profession = profession;
	}
}
