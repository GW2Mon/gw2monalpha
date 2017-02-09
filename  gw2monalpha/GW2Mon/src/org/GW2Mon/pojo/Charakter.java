package org.GW2Mon.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	private String Name;
	private String Image;

	/**
	 * @category constructor
	 * @param id
	 * @param account
	 * @param name
	 * @param level
	 * @param craftdisc1
	 * @param craftdisc2
	 * @param skillpoints
	 * @param supply
	 * @param gender
	 * @param race
	 * @param profession
	 * @param image
	 */
	public Charakter(int id, Account account, String name, int level,
			CraftingDiscipline craftdisc1, CraftingDiscipline craftdisc2,
			int skillpoints, int supply, Gender gender, Race race,
			Profession profession, String image) {
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

	public Charakter() {
	}

	/**
	 * @category getter
	 * @return
	 */
	@Id
	public int getId() {
		return this.Id;
	}

	/**
	 * @category setter
	 * @param id
	 */
	public void setId(int id) {
		this.Id = id;
	}

	/**
	 * @category getter
	 * @return
	 */
	@ManyToOne(targetEntity = Account.class)
	@JoinColumn(name = "Account")
	public Account getAccount() {
		return this.Account;
	}

	/**
	 * @category setter
	 * @param account
	 */
	public void setAccount(Account account) {
		this.Account = account;
	}

	/**
	 * @category setter
	 * @param Name
	 */
	public void setName(String Name) {
		this.Name = Name;
	}

	/**
	 * @category getter
	 * @return
	 */
	@Column(nullable = false)
	public String getName() {
		return this.Name;
	}

	/**
	 * @category setter
	 * @param image
	 */
	public void setImage(String image) {
		this.Image = image;
	}

	/**
	 * @category getter
	 * @return
	 */
	@Column(nullable = true)
	public String getImage() {
		return this.Image;
	}

	/**
	 * @category setter
	 * @param gender
	 */
	public void setGender(Gender gender) {
		this.Gender = gender;
	}

	/**
	 * @category getter
	 * @return
	 */
	@Column(nullable = false)
	@ManyToOne(targetEntity = Gender.class)
	@JoinColumn(name = "Gender")
	public Gender getGender() {
		return this.Gender;
	}

	/**
	 * @category setter
	 * @param level
	 */
	public void setLevel(int level) {
		this.Level = level;
	}

	/**
	 * @category getter
	 * @return
	 */
	@Column(nullable = false)
	public int getLevel() {
		return this.Level;
	}

	/**
	 * @category getter
	 * @return
	 */
	public int getSkillpoints() {
		return Skillpoints;
	}

	/**
	 * @category setter
	 * @param skillpoints
	 */
	public void setSkillpoints(int skillpoints) {
		Skillpoints = skillpoints;
	}

	/**
	 * @category getter
	 * @return
	 */
	@ManyToOne(targetEntity = Profession.class)
	@JoinColumn(name = "Profession")
	public Profession getProfession() {
		return Profession;
	}

	/**
	 * @category setter
	 * @param profession
	 */
	public void setProfession(Profession profession) {
		Profession = profession;
	}

	/**
	 * @category getter
	 * @return
	 */
	public int getSupply() {
		return Supply;
	}

	/**
	 * @category setter
	 * @param supply
	 */
	public void setSupply(int supply) {
		Supply = supply;
	}

	/**
	 * @category getter
	 * @return
	 */
	@ManyToOne(targetEntity = CraftingDiscipline.class, optional = true)
	@JoinColumn(name = "CraftDisc2")
	public CraftingDiscipline getCraftDisc2() {
		return CraftDisc2;
	}

	/**
	 * @category setter
	 * @param craftDisc2
	 */
	public void setCraftDisc2(CraftingDiscipline craftDisc2) {
		CraftDisc2 = craftDisc2;
	}

	/**
	 * @category getter
	 * @return
	 */
	@Column(nullable = false)
	@ManyToOne(targetEntity = Race.class)
	@JoinColumn(name = "Race")
	public Race getRace() {
		return Race;
	}

	/**
	 * @category setter
	 * @param race
	 */
	public void setRace(Race race) {
		Race = race;
	}

	/**
	 * @category getter
	 * @return
	 */
	@ManyToOne(targetEntity = CraftingDiscipline.class, optional = true)
	@JoinColumn(name = "CraftDisc1")
	public CraftingDiscipline getCraftDisc1() {
		return CraftDisc1;
	}

	/**
	 * @category setter
	 * @param craftDisc1
	 */
	public void setCraftDisc1(CraftingDiscipline craftDisc1) {
		CraftDisc1 = craftDisc1;
	}

}
