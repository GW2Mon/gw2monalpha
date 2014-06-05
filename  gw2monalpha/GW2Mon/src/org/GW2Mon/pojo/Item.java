package org.GW2Mon.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Item {

	private int Id, VendorValue, Level, Type, Soulbound, Accountbount,
			SoulboundOnUse, Armor, Weapon, Bag, Cunsumable, Container, Trinket,
			UpgradeComponent, Back, Gathering, Gizmo, Tool, WeaponType,
			DamageType, MinPower, MaxPower, ArmorType, WeightClass, Defence,
			Size, Duration, UnlockType, Charges, InfusionSlot, Attribute1Mod,
			Attribute2Mod, Attribute3Mod, ApiId;
	private ItemVzb ItemVZB;
	private ItemVzb1 ItemVZB1;
	private ItemVzb2 ItemVZB2;
	private Rarity Rarity;
	private Attribute Attribute1Id, Attribute2Id, Attribute3Id;

	private String NameGer, NameEng, DescGer, DescEng, Image;

	public Item(int id, ItemVzb itemvzb, ItemVzb1 itemvzb1, ItemVzb2 itemvzb2,
			String nameGer, String nameEng, String descGer, String descEng,
			int vendorValue, int level, int type, int soulbound,
			int accountbount, int soulboundOnUse, Rarity rarity, String image,
			int armor, int armorType, int weightClass, int defence, int weapon,
			int weaponType, int damageType, int minPower, int maxPower,
			int back, int bag, int size, int tool, int charges, int container,
			int cunsumable, int duration, int unlockType, int apiId) {
		this.setId(id);
		this.setItemVZB(itemvzb);
		this.setItemVZB1(itemvzb1);
		this.setItemVZB2(itemvzb2);
		this.setRarity(rarity);
		this.setImage(image);
		this.setNameGer(nameGer);
		this.setNameEng(nameEng);
		this.setDescGer(descGer);
		this.setDescEng(descEng);
		this.setVendorValue(vendorValue);
		this.setLevel(level);
		this.setSoulbound(soulbound);
		this.setAccountbount(accountbount);
		this.setSoulboundOnUse(soulboundOnUse);
		this.setType(type);
		this.setArmor(armor);
		this.setArmorType(armorType);
		this.setWeightClass(weightClass);
		this.setDefence(defence);
		this.setWeapon(weapon);
		this.setWeaponType(weaponType);
		this.setDamageType(damageType);
		this.setMinPower(minPower);
		this.setMaxPower(maxPower);
		this.setBack(back);
		this.setBag(bag);
		this.setSize(size);
		this.setTool(tool);
		this.setCharges(charges);
		this.setContainer(container);
		this.setCunsumable(cunsumable);
		this.setDuration(duration);
		this.setUnlockType(unlockType);
		this.setApiId(apiId);
	}

	@Column(nullable = false)
	public int getApiId() {
		return ApiId;
	}

	public void setApiId(int apiId) {
		ApiId = apiId;
	}

	@Id
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	@Column(nullable = false)
	@ManyToOne(targetEntity=ItemVzb.class)
	public ItemVzb getItemVZB() {
		return ItemVZB;
	}

	public void setItemVZB(ItemVzb itemVZB) {
		ItemVZB = itemVZB;
	}

	@Column(nullable = false)
	@ManyToOne(targetEntity=ItemVzb1.class)
	public ItemVzb1 getItemVZB1() {
		return ItemVZB1;
	}

	public void setItemVZB1(ItemVzb1 itemVZB1) {
		ItemVZB1 = itemVZB1;
	}

	@Column(nullable = false)
	@ManyToOne(targetEntity=ItemVzb2.class)
	public ItemVzb2 getItemVZB2() {
		return ItemVZB2;
	}

	public void setItemVZB2(ItemVzb2 itemVZB2) {
		ItemVZB2 = itemVZB2;
	}

	@Column(nullable = false)
	@ManyToOne(targetEntity=Rarity.class)
	public org.GW2Mon.pojo.Rarity getRarity() {
		return Rarity;
	}

	public void setRarity(org.GW2Mon.pojo.Rarity rarity) {
		Rarity = rarity;
	}

	public String getNameGer() {
		return NameGer;
	}

	public void setNameGer(String nameGer) {
		NameGer = nameGer;
	}

	public String getNameEng() {
		return NameEng;
	}

	public void setNameEng(String nameEng) {
		NameEng = nameEng;
	}

	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}

	public String getDescGer() {
		return DescGer;
	}

	public void setDescGer(String descGer) {
		DescGer = descGer;
	}

	public String getDescEng() {
		return DescEng;
	}

	public void setDescEng(String descEng) {
		DescEng = descEng;
	}

	@Column(nullable = false)
	public int getVendorValue() {
		return VendorValue;
	}

	public void setVendorValue(int vendorValue) {
		VendorValue = vendorValue;
	}

	@Column(nullable = false)
	public int getLevel() {
		return Level;
	}

	public void setLevel(int level) {
		Level = level;
	}

	@Column(nullable = false)
	public int getType() {
		return Type;
	}

	public void setType(int type) {
		Type = type;
	}

	public int getSoulbound() {
		return Soulbound;
	}

	public void setSoulbound(int soulbound) {
		Soulbound = soulbound;
	}

	public int getAccountbount() {
		return Accountbount;
	}

	public void setAccountbount(int accountbount) {
		Accountbount = accountbount;
	}

	public int getSoulboundOnUse() {
		return SoulboundOnUse;
	}

	public void setSoulboundOnUse(int soulboundOnUse) {
		SoulboundOnUse = soulboundOnUse;
	}

	public int getArmor() {
		return Armor;
	}

	public void setArmor(int armor) {
		Armor = armor;
	}

	public int getWeapon() {
		return Weapon;
	}

	public void setWeapon(int weapon) {
		Weapon = weapon;
	}

	public int getBag() {
		return Bag;
	}

	public void setBag(int bag) {
		Bag = bag;
	}

	public int getCunsumable() {
		return Cunsumable;
	}

	public void setCunsumable(int cunsumable) {
		Cunsumable = cunsumable;
	}

	public int getContainer() {
		return Container;
	}

	public void setContainer(int container) {
		Container = container;
	}

	public int getTrinket() {
		return Trinket;
	}

	public void setTrinket(int trinket) {
		Trinket = trinket;
	}

	public int getUpgradeComponent() {
		return UpgradeComponent;
	}

	public void setUpgradeComponent(int upgradeComponent) {
		UpgradeComponent = upgradeComponent;
	}

	public int getBack() {
		return Back;
	}

	public void setBack(int back) {
		Back = back;
	}

	public int getGathering() {
		return Gathering;
	}

	public void setGathering(int gathering) {
		Gathering = gathering;
	}

	public int getGizmo() {
		return Gizmo;
	}

	public void setGizmo(int gizmo) {
		Gizmo = gizmo;
	}

	public int getTool() {
		return Tool;
	}

	public void setTool(int tool) {
		Tool = tool;
	}

	public int getWeaponType() {
		return WeaponType;
	}

	public void setWeaponType(int weaponType) {
		WeaponType = weaponType;
	}

	public int getDamageType() {
		return DamageType;
	}

	public void setDamageType(int damageType) {
		DamageType = damageType;
	}

	public int getMinPower() {
		return MinPower;
	}

	public void setMinPower(int minPower) {
		MinPower = minPower;
	}

	public int getMaxPower() {
		return MaxPower;
	}

	public void setMaxPower(int maxPower) {
		MaxPower = maxPower;
	}

	public int getArmorType() {
		return ArmorType;
	}

	public void setArmorType(int armorType) {
		ArmorType = armorType;
	}

	public int getWeightClass() {
		return WeightClass;
	}

	public void setWeightClass(int weightClass) {
		WeightClass = weightClass;
	}

	public int getDefence() {
		return Defence;
	}

	public void setDefence(int defence) {
		Defence = defence;
	}

	public int getSize() {
		return Size;
	}

	public void setSize(int size) {
		Size = size;
	}

	public int getDuration() {
		return Duration;
	}

	public void setDuration(int duration) {
		Duration = duration;
	}

	public int getUnlockType() {
		return UnlockType;
	}

	public void setUnlockType(int unlockType) {
		UnlockType = unlockType;
	}

	public int getCharges() {
		return Charges;
	}

	public void setCharges(int charges) {
		Charges = charges;
	}

	public int getInfusionSlot() {
		return InfusionSlot;
	}

	public void setInfusionSlot(int infusionSlot) {
		InfusionSlot = infusionSlot;
	}

	@ManyToOne(targetEntity=Attribute.class)
	public Attribute getAttribute1Id() {
		return Attribute1Id;
	}

	public void setAttribute1Id(Attribute attribute1Id) {
		Attribute1Id = attribute1Id;
	}

	@ManyToOne(targetEntity=Attribute.class)
	public int getAttribute1Mod() {
		return Attribute1Mod;
	}

	public void setAttribute1Mod(int attribute1Mod) {
		Attribute1Mod = attribute1Mod;
	}

	@ManyToOne(targetEntity=Attribute.class)
	public Attribute getAttribute2Id() {
		return Attribute2Id;
	}

	public void setAttribute2Id(Attribute attribute2Id) {
		Attribute2Id = attribute2Id;
	}

	public int getAttribute2Mod() {
		return Attribute2Mod;
	}

	public void setAttribute2Mod(int attribute2Mod) {
		Attribute2Mod = attribute2Mod;
	}

	@ManyToOne(targetEntity=Attribute.class)
	public Attribute getAttribute3Id() {
		return Attribute3Id;
	}

	public void setAttribute3Id(Attribute attribute3Id) {
		Attribute3Id = attribute3Id;
	}

	public int getAttribute3Mod() {
		return Attribute3Mod;
	}

	public void setAttribute3Mod(int attribute3Mod) {
		Attribute3Mod = attribute3Mod;
	}
}
