package org.GW2Mon.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Trait_has_Attribute {

	@Id
	private Trait Trait;
	private Attribute Attribute;

	public Trait_has_Attribute(Trait trait, Attribute attribute) {
		this.setTrait(trait);
		this.setAttribute(attribute);
	}

	@ManyToOne(targetEntity=Attribute.class)
	public Attribute getAttribute() {
		return Attribute;
	}

	public void setAttribute(Attribute attribute) {
		Attribute = attribute;
	}

	@ManyToOne(targetEntity=Trait.class)
	public Trait getTrait() {
		return Trait;
	}

	public void setTrait(Trait trait) {
		Trait = trait;
	}
}
