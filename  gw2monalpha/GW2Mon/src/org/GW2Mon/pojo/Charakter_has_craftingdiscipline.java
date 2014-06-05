package org.GW2Mon.pojo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Charakter_has_craftingdiscipline implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Charakter_has_craftingdiscipline(Charakter charakter,
			CraftingDiscipline craftingdiscipline, int level) {
		this.setCharakter(charakter);
		this.setCraftingdiscipline(craftingdiscipline);
		this.setLevel(level);
	}

	@Id
	@ManyToOne(targetEntity=Charakter.class)
	public Charakter getCharakter() {
		return charakter;
	}

	public void setCharakter(Charakter charakter) {
		this.charakter = charakter;
	}

	@Id
	@ManyToOne(targetEntity=CraftingDiscipline.class)
	public CraftingDiscipline getCraftingdiscipline() {
		return craftingdiscipline;
	}

	public void setCraftingdiscipline(CraftingDiscipline craftingdiscipline) {
		this.craftingdiscipline = craftingdiscipline;
	}

	public int getLevel() {
		return Level;
	}

	public void setLevel(int level) {
		this.Level = level;
	}

	private Charakter charakter;
	private CraftingDiscipline craftingdiscipline;
	private int Level;

}
