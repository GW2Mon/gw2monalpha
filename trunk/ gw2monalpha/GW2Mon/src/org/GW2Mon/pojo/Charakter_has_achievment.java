package org.GW2Mon.pojo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Charakter_has_achievment implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@ManyToOne(targetEntity=Charakter.class, cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Charakter Charakter;
	@Id
	@ManyToOne(targetEntity=Achievment.class, cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Achievment Achievment;

	public Charakter_has_achievment(Charakter charakter, Achievment achievment) {
		this.setCharakter(charakter);
		this.setAchievment(achievment);
	}

	public Charakter getCharakter() {
		return Charakter;
	}

	public void setCharakter(Charakter charakter) {
		Charakter = charakter;
	}

	public Achievment getAchievment() {
		return Achievment;
	}

	public void setAchievment(Achievment achievment) {
		Achievment = achievment;
	}

}
