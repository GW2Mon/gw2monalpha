package org.GW2Mon.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Profession {
	private String NameGer, NameEng;
	private int Id,Typ;
	private Trait Trait1,Trait2,Trait3;

	public Profession(int id, String nameGer, String nameEng,int typ,Trait trait1,Trait trait2, Trait trait3) {
		this.setId(id);
		this.setNameGer(nameGer);
		this.setNameEng(nameEng);
		this.setTyp(typ);
		this.setTrait1(trait1);
		this.setTrait2(trait2);
		this.setTrait3(trait3);
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

	@Id
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	@ManyToOne(targetEntity=Trait.class)
	public Trait getTrait2() {
		return Trait2;
	}

	public void setTrait2(Trait trait2) {
		Trait2 = trait2;
	}

	@ManyToOne(targetEntity=Trait.class)
	public Trait getTrait1() {
		return Trait1;
	}

	public void setTrait1(Trait trait1) {
		Trait1 = trait1;
	}

	@ManyToOne(targetEntity=Trait.class)
	public Trait getTrait3() {
		return Trait3;
	}

	public void setTrait3(Trait trait3) {
		Trait3 = trait3;
	}

	@Column(nullable=false)
	public int getTyp() {
		return Typ;
	}

	public void setTyp(int typ) {
		Typ = typ;
	}

}
