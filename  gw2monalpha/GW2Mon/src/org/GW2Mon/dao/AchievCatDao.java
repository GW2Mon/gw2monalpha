package org.GW2Mon.dao;

import java.util.ArrayList;

import org.GW2Mon.model.DB;
import org.GW2Mon.pojo.AchievCat;
import org.hibernate.Transaction;

public class AchievCatDao {

	/**
	 * Returns all AchievCats.
	 * @return ArrayList< AchievCat>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<AchievCat> getAchievCats(){
		ArrayList<AchievCat> arrayList = null;
		DB db = new DB();
		arrayList = (ArrayList<AchievCat>) db.session.createQuery("from "+AchievCat.class).list();
		return arrayList;
	}
	
	/**
	 * Returns AchievCat with Id or NameEng param
	 * corresponding on Type of param.
	 * @param param
	 * @return AchievCat
	 */
	public AchievCat getAchievCat(Object param){
		AchievCat achievCat = null;
		DB db = new DB();
		if (param.getClass()==Integer.class)
		achievCat = (AchievCat) db.session.get(AchievCat.class,(Integer) param);
		else if (param.getClass()==String.class)
			achievCat= (AchievCat) db.session.createQuery("from "+AchievCat.class+"where NameEng='"+param+"'");
		else System.out.println("Type of param not suported.");
		return achievCat;
	}
	
	/**
	 * Sets AchievCat achievCat.
	 * @param achievCat
	 */
	public void setAchievCat(AchievCat achievCat){
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			db.session.saveOrUpdate(achievCat);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
	
	/**
	 * Sets all AchievCats in ArrayList arrayList.
	 * @param arrayList
	 */
	public void setAchievCats(ArrayList<AchievCat> arrayList){
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			for (AchievCat achievCat : arrayList)
				db.session.saveOrUpdate(achievCat);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
	
}
