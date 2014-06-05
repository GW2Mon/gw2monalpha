package org.GW2Mon.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Charakter {
	private int Id;
	private Account Account;
	private int Level;
	private CraftingDiscipline CraftDisc1;
	private CraftingDiscipline CraftDisc2;
	private int Skillpoints;
	private int Supply;
	private Gender Gender;
	private Race Race;
	private Profession Profession;
	private String Name, Image;

	public Charakter(int id, Account account, String name, int level,
			CraftingDiscipline craftdisc1, CraftingDiscipline craftdisc2, int skillpoints, int supply,
			Gender gender, Race race, Profession profession, String image) {
		this.setId(id);
		this.setAccount(account);
		this.setName(name);
		this.setLevel(level);
		this.setCraftDisc1(craftdisc1);
		this.setCraftDisc2(craftdisc2);
		this.setSkillpoints(skillpoints);
		this.setSupply(supply);
		this.setImage(image);
		this.setGender(gender);
		this.setRace(race);
		this.setProfession(profession);
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	@Column(nullable=false)
	public String getName() {
		return this.Name;
	}

	public void setImage(String image) {
		this.Image = image;
	}

	public String getImage() {
		return this.Image;
	}

	public void setId(int id) {
		this.Id = id;
	}

	@Id
	public int getId() {
		return this.Id;
	}

	public void setAccount(Account account) {
		this.Account = account;
	}

	@ManyToOne(targetEntity=Account.class)
	public Account getAccount() {
		return this.Account;
	}

	public void setGender(Gender gender) {
		this.Gender = gender;
	}

	@ManyToOne(targetEntity=Gender.class)
	public Gender getGender() {
		return this.Gender;
	}

	public void setLevel(int level) {
		this.Level = level;
	}

	@Column(nullable=false)
	public int getLevel() {
		return this.Level;
	}

	public int getSkillpoints() {
		return Skillpoints;
	}

	public void setSkillpoints(int skillpoints) {
		Skillpoints = skillpoints;
	}

	@ManyToOne(targetEntity=Profession.class)
	public Profession getProfession() {
		return Profession;
	}

	public void setProfession(Profession profession) {
		Profession = profession;
	}

	public int getSupply() {
		return Supply;
	}

	public void setSupply(int supply) {
		Supply = supply;
	}

	@ManyToOne(targetEntity=CraftingDiscipline.class)
	public CraftingDiscipline getCraftDisc2() {
		return CraftDisc2;
	}

	public void setCraftDisc2(CraftingDiscipline craftDisc2) {
		CraftDisc2 = craftDisc2;
	}

	@ManyToOne(targetEntity=Race.class)
	public Race getRace() {
		return Race;
	}

	public void setRace(Race race) {
		Race = race;
	}

	@ManyToOne(targetEntity=CraftingDiscipline.class)
	public CraftingDiscipline getCraftDisc1() {
		return CraftDisc1;
	}

	public void setCraftDisc1(CraftingDiscipline craftDisc1) {
		CraftDisc1 = craftDisc1;
	}

}
