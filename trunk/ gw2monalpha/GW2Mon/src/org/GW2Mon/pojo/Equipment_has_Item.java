package org.GW2Mon.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Equipment_has_Item {

	private Equipment Equipment;
	private Item Item;

	public Equipment_has_Item(Equipment equipment, Item item) {
		this.setEquipment(equipment);
		this.setItem(item);
	}

	@Id
	@ManyToOne(targetEntity = Equipment.class)
	public Equipment getEquipment() {
		return Equipment;
	}

	public void setEquipment(Equipment equipment) {
		Equipment = equipment;
	}

	@Id
	@ManyToOne(targetEntity = Item.class)
	public Item getItem() {
		return Item;
	}

	public void setItem(Item item) {
		Item = item;
	}

}
