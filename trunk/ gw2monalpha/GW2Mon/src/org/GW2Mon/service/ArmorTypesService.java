package org.GW2Mon.service;

import java.util.ArrayList;

import org.GW2Mon.dao.ArmorTypeDao;
import org.GW2Mon.pojo.ArmorType;

public class ArmorTypesService {

	private ArmorTypeDao armorTypeDao = new ArmorTypeDao();

	/**
	 * Saves all ArmorTypes.
	 */
	public void saveArmorTypes() {
		armorTypeDao.setArmorTypes(armorTypeDao.getArmorTypes());
	}

	/**
	 * Saves all ArmorTypes in ArrayList arrayList.
	 * 
	 * @param arrayList
	 */
	public void saveArmorTypes(ArrayList<ArmorType> arrayList) {
		armorTypeDao.setArmorTypes(arrayList);
	}

	/**
	 * Saves ArmorType AT.
	 * 
	 * @param AT
	 */
	public void saveArmorType(ArmorType AT) {
		armorTypeDao.setArmorType(AT);
	}

	/**
	 * Saves all ArmorTypes of Type id.
	 * 
	 * @param id
	 */
	public void saveArmorType(int id) {
		armorTypeDao.setArmorType(armorTypeDao.getArmorType(id));
	}

	/**
	 * Loads all ArmorTypes.
	 * 
	 * @return ArrayList< ArmorType>
	 */
	public ArrayList<ArmorType> loadArmorTypes() {
		return armorTypeDao.getArmorTypes();
	}

	/**
	 * Loads ArmorType with Id id.
	 * 
	 * @param id
	 * @return ArmorType
	 */
	public ArmorType loadArmorType(int id) {
		return armorTypeDao.getArmorType(id);
	}

	public ArrayList<ArmorType> loadArmorTypes(int id) {
		return armorTypeDao.getArmorTypes(id);
	}
}
