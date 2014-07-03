package org.GW2Mon.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Equipment {

	private int Id;
	private Account Account;
	private Charakter Charakter;
	private Item Head, Shoulder, Torso, Hands, Feet, Back, Necklage, EarringL,
			EarringR, Accessior1, Accessior2, HandL, HandR;

	private String Name;

	public Equipment(int id, Account account, Charakter charakter, String name) {
		this.Id = id;
		this.Account = account;
		this.Charakter = charakter;
		this.Name = name;
	}

	@Id
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	@Column(nullable = false)
	@ManyToOne(targetEntity = Account.class)
	public Account getAccount() {
		return Account;
	}

	public void setAccount(Account account) {
		Account = account;
	}

	@Column(nullable = false)
	@ManyToOne(targetEntity = Charakter.class)
	public Charakter getCharakter() {
		return Charakter;
	}

	public void setCharakter(Charakter charakter) {
		Charakter = charakter;
	}

	@ManyToOne(targetEntity = Item.class)
	public Item getHead() {
		return Head;
	}

	public void setHead(Item head) {
		Head = head;
	}

	@ManyToOne(targetEntity = Item.class)
	public Item getShoulder() {
		return Shoulder;
	}

	public void setShoulder(Item shoulder) {
		Shoulder = shoulder;
	}

	@ManyToOne(targetEntity = Item.class)
	public Item getTorso() {
		return Torso;
	}

	public void setTorso(Item torso) {
		Torso = torso;
	}

	@ManyToOne(targetEntity = Item.class)
	public Item getHands() {
		return Hands;
	}

	public void setHands(Item hands) {
		Hands = hands;
	}

	@ManyToOne(targetEntity = Item.class)
	public Item getFeet() {
		return Feet;
	}

	public void setFeet(Item feet) {
		Feet = feet;
	}

	@ManyToOne(targetEntity = Item.class)
	public Item getBack() {
		return Back;
	}

	public void setBack(Item back) {
		Back = back;
	}

	@ManyToOne(targetEntity = Item.class)
	public Item getNecklage() {
		return Necklage;
	}

	public void setNecklage(Item necklage) {
		Necklage = necklage;
	}

	@ManyToOne(targetEntity = Item.class)
	public Item getEarringL() {
		return EarringL;
	}

	public void setEarringL(Item earringL) {
		EarringL = earringL;
	}

	@ManyToOne(targetEntity = Item.class)
	public Item getAccessior1() {
		return Accessior1;
	}

	public void setAccessior1(Item accessior1) {
		Accessior1 = accessior1;
	}

	@ManyToOne(targetEntity = Item.class)
	public Item getAccessior2() {
		return Accessior2;
	}

	public void setAccessior2(Item accessior2) {
		Accessior2 = accessior2;
	}

	@ManyToOne(targetEntity = Item.class)
	public Item getHandL() {
		return HandL;
	}

	public void setHandL(Item handL) {
		HandL = handL;
	}

	@ManyToOne(targetEntity = Item.class)
	public Item getHandR() {
		return HandR;
	}

	public void setHandR(Item handR) {
		HandR = handR;
	}

	@Column(nullable = false)
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@ManyToOne(targetEntity = Item.class)
	public Item getEarringR() {
		return EarringR;
	}

	public void setEarringR(Item earringR) {
		EarringR = earringR;
	}

}
