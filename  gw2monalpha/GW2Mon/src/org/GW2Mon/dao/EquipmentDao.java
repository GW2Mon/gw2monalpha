package org.GW2Mon.dao;

import java.util.ArrayList;

import org.GW2Mon.model.DB;
import org.GW2Mon.pojo.Account;
import org.GW2Mon.pojo.Charakter;
import org.GW2Mon.pojo.Equipment;
import org.hibernate.Transaction;

public class EquipmentDao {

	/**
	 * Returns Equipment with Id id.
	 * @param id
	 * @return Equipment
	 */
	public Equipment getEquipment(int id){
		Equipment equip = null;
		DB db = new DB();
		equip=(Equipment) db.session.get(Equipment.class, id);
		return equip;
	}
	
	/**
	 * Returns all Equipments.
	 * @return ArrayList< Equipment>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Equipment> getEquipments(){
		ArrayList<Equipment> arrayList=null;
		DB db = new DB();
		arrayList=(ArrayList<Equipment>) db.session.createQuery("from "+Equipment.class).list();
		return arrayList;
	}
	
	/**
	 * Returns all Equipments of Account or Charakter Equip
	 * corresponding on Type of Equip.
	 * @param Equip
	 * @return ArrayList< Equipment>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Equipment> getEquipments(Object Equip){
		ArrayList<Equipment> arrayList = null;
		DB db=new DB();
		if (Equip.getClass()==Account.class)
		arrayList= (ArrayList<Equipment>) db.session.createQuery("from "+Equipment.class+" where Account ="+((Account) Equip).getId()).list();
		else 
			if(Equip.getClass()==Charakter.class)
				arrayList= (ArrayList<Equipment>) db.session.createQuery("from "+Equipment.class+" where Charakter ="+((Charakter) Equip).getId()).list();
		return arrayList;
	}
	
	/**
	 * Sets Equipment Equip.
	 * @param Equip
	 */
	public void setEquipment(Equipment Equip){
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			db.session.saveOrUpdate(Equip);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
	
	/**
	 * Sets all Equipments in ArrayList arrayList.
	 * @param arrayList
	 */
	public void setEquipments(ArrayList<Equipment> arrayList){
		DB db=new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			for (Equipment Equip : arrayList)
				db.session.saveOrUpdate(Equip);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
	
}
