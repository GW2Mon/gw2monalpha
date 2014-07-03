package org.GW2Mon.dao;

import java.util.ArrayList;

import org.GW2Mon.function.DB;
import org.GW2Mon.pojo.ArmorType;
import org.hibernate.Transaction;

public class ArmorTypeDao {

	/**
	 * Returns the ArmorType with Id id.
	 * 
	 * @param id
	 * @return ArmorType
	 */
	public ArmorType getArmorType(int id) {
		ArmorType armorType = null;
		DB db = new DB();
		armorType = (ArmorType) db.session.get(ArmorType.class, id);
		return armorType;
	}

	/**
	 * Returns all ArmorTypes.
	 * 
	 * @return ArrayList< ArmorType>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<ArmorType> getArmorTypes() {
		ArrayList<ArmorType> arrayList = null;
		DB db = new DB();
		arrayList = (ArrayList<ArmorType>) db.session.createQuery(
				"" + ArmorType.class).list();
		return arrayList;
	}

	/**
	 * Returns all ArmorTypes with Type type.
	 * 
	 * @param type
	 * @return ArrayList< ArmorType>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<ArmorType> getArmorTypes(int type) {
		ArrayList<ArmorType> arrayList = null;
		DB db = new DB();
		arrayList = (ArrayList<ArmorType>) db.session.createQuery(
				"from " + ArmorType.class + " where Type=" + type).list();
		return arrayList;
	}

	/**
	 * Sets the ArmorType AT.
	 * 
	 * @param AT
	 */
	public void setArmorType(ArmorType AT) {
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			db.session.saveOrUpdate(AT);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}

	/**
	 * Sets all ArmorTypes in the ArrayList arrayList.
	 * 
	 * @param arrayList
	 */
	public void setArmorTypes(ArrayList<ArmorType> arrayList) {
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			for (ArmorType AT : arrayList)
				db.session.saveOrUpdate(AT);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
}
