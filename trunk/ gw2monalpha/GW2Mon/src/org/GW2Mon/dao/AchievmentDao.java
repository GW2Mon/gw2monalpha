package org.GW2Mon.dao;

import java.util.ArrayList;

import org.hibernate.Transaction;
import org.GW2Mon.model.DB;
import org.GW2Mon.pojo.AchievCat;
import org.GW2Mon.pojo.AchievCat1;
import org.GW2Mon.pojo.Achievment;

public class AchievmentDao {

	/**
	 * Returns the Achievment with Id id
	 * @param id
	 * @return Achievment
	 */
	public Achievment getAchievment(int id) {
		Achievment achiev = null;
		DB db = new DB();
		achiev = (Achievment) db.session.get(Achievment.class, id);
		return achiev;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Achievment> getAchievments(Object param){
		ArrayList<Achievment> arrayList = null;
		DB db = new DB();
		if (param.getClass()==AchievCat.class)
		arrayList = (ArrayList<Achievment>) db.session.createQuery("from "+Achievment.class+" where AchievCat="+param).list();
		else if (param.getClass()==AchievCat1.class)
			arrayList=(ArrayList<Achievment>) db.session.createQuery("from "+Achievment.class+" where AchievCat1="+param).list();
		else System.out.println("Type of param not supported.");
		return arrayList;
	}
	
	/**
	 * Returns all Achievments with AchievCat param1 & AchievCat1 param2
	 * or NameGer param1 & NameEng param2 corresponding on Types of Parameters
	 * @param param1
	 * @param param2
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Achievment> getAchievments(Object param1,Object param2){
		ArrayList<Achievment> arrayList = null;
		DB db = new DB();
		if ((param1.getClass()==Integer.class)&&(param2.getClass()==Integer.class))
		arrayList = (ArrayList<Achievment>) db.session.createQuery("from "+Achievment.class+"where AchievCat="+(Integer)param1+" and AchievCat1="+(Integer)param2).list();
		else if ((param1.getClass()==String.class)&&(param2.getClass()==String.class))
			arrayList = (ArrayList<Achievment>) db.session.createQuery("from "+Achievment.class+" where NameGer='"+(String)param1+"' and NameEng='"+(String)param2+"'").list();
		return arrayList;
	}

	/**
	 * Returns all Achievments
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Achievment> getAchievments() {
		ArrayList<Achievment> arrayList = null;
		DB db = new DB();
		arrayList = (ArrayList<Achievment>) db.session.createQuery(
				" from" + Achievment.class).list();
		return arrayList;
	}

	/**
	 * Sets Achievment Achiev
	 * @param Achiev
	 */
	public void setAchievment(Achievment Achiev) {
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			db.session.saveOrUpdate(Achiev);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}

	/**
	 * Sets all Achievments in the ArrayList arrayList
	 * @param arrayList
	 */
	public void setAchievments(ArrayList<Achievment> arrayList) {
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			for (Achievment achiev : arrayList)
				db.session.saveOrUpdate(achiev);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}

}
