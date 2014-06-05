package org.GW2Mon.dao;

import java.util.ArrayList;

import org.GW2Mon.model.DB;
import org.GW2Mon.pojo.Rarity;
import org.hibernate.Transaction;

public class RarityDao {

	/**
	 * Returns Rarity with Id id
	 * @param Id
	 * @return Rarity
	 */
	public Rarity getRarity(int id){
		Rarity rarity =null;
		DB db = new DB();
		rarity = (Rarity) db.session.get(Rarity.class, id);
		return rarity;
	}
	
	/**
	 * Returns all Rarities.
	 * @return ArrayList< Rarity>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Rarity> getRarities(){
		ArrayList<Rarity> arrayList=null;
		DB db = new DB();
		arrayList = (ArrayList<Rarity>) db.session.createQuery("from "+Rarity.class).list();
		return arrayList;
	}
	
	/**
	 * Sets all Rarities in ArrayList arrayList.
	 * @param arrayList
	 */
	public void setRarities(ArrayList<Rarity> arrayList){
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			for (Rarity rarity : arrayList)
				db.session.saveOrUpdate(rarity);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
	
	/**
	 * Sets Rarity rarity.
	 * @param rarity
	 */
	public void setRarity(Rarity rarity){
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			db.session.saveOrUpdate(rarity);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
	
}
