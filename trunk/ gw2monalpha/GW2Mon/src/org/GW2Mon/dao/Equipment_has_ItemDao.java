package org.GW2Mon.dao;

import java.util.ArrayList;

import org.GW2Mon.model.DB;
import org.GW2Mon.pojo.Equipment;
import org.GW2Mon.pojo.Equipment_has_Item;
import org.GW2Mon.pojo.Item;
import org.hibernate.Transaction;

public class Equipment_has_ItemDao {

	@SuppressWarnings("unchecked")
	public ArrayList<Equipment_has_Item> getEquipment_has_Items(){
		ArrayList<Equipment_has_Item> arrayList=null;
		DB db = new DB();
		arrayList = (ArrayList<Equipment_has_Item>) db.session.createQuery("from "+Equipment_has_Item.class).list();
		return arrayList;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Equipment_has_Item> getEquipment_has_Items(Object Param){
		ArrayList<Equipment_has_Item> arrayList=null;
		DB db = new DB();
		if (Param.getClass()==Equipment.class)
			arrayList= (ArrayList<Equipment_has_Item>) db.session.createQuery("from"+Equipment_has_Item.class+" where Equipment="+((Equipment)Param).getId()).list();
		else if (Param.getClass()==Item.class)
			arrayList= (ArrayList<Equipment_has_Item>) db.session.createQuery("from"+Equipment_has_Item.class+" where Item="+((Item)Param).getId()).list();
		return arrayList;
	}
	
	public Equipment_has_Item getEquipment_has_Item(Equipment Equip,Item item){
		Equipment_has_Item Equip_has_Item=null;
		DB db=new DB();
		Equip_has_Item = (Equipment_has_Item) db.session.createQuery(""+Equipment_has_Item.class+""+Equip.getId()+""+item.getId());
		return Equip_has_Item;
	}
	
	public void setEquipment_has_Item(Equipment_has_Item Equip_has_Item){
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			db.session.saveOrUpdate(Equip_has_Item);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
	
	public void setEquipment_has_Items(ArrayList<Equipment_has_Item> arrayList){
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			for (Equipment_has_Item Equip_Has_Item : arrayList)
				db.session.saveOrUpdate(Equip_Has_Item);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
	
	public void setEquipment_has_Item(Equipment Equip,Item item){
		DB db=new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			db.session.saveOrUpdate(getEquipment_has_Item(Equip, item));
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
		
	}
	
}
