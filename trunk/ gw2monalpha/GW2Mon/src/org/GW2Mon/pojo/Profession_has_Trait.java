package org.GW2Mon.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Profession_has_Trait {

	@Id
	private Profession Profession;
	private Trait Trait;

	public Profession_has_Trait(Profession profession, Trait trait) {
		this.setProfession(profession);
		this.setTrait(trait);
	}

	@ManyToOne(targetEntity=Trait.class)
	public Trait getTrait() {
		return Trait;
	}

	public void setTrait(Trait trait) {
		Trait = trait;
	}

	@ManyToOne(targetEntity=Profession.class)
	public Profession getProfession() {
		return Profession;
	}

	public void setProfession(Profession profession) {
		Profession = profession;
	}
}
