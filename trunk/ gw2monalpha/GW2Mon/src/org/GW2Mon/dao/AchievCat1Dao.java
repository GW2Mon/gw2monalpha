package org.GW2Mon.dao;

import java.util.ArrayList;

import org.GW2Mon.function.DB;
import org.GW2Mon.pojo.AchievCat;
import org.GW2Mon.pojo.AchievCat1;
import org.hibernate.Transaction;

public class AchievCat1Dao {

	/**
	 * Returns AchievCat1 with Id or NameEng param corresponding on Type of
	 * param.
	 * 
	 * @param param
	 * @return AchievCat1
	 */
	public AchievCat1 getAchieCat1(Object param) {
		AchievCat1 achievCat1 = null;
		DB db = new DB();
		if (param.getClass() == Integer.class)
			achievCat1 = (AchievCat1) db.session.get(AchievCat1.class,
					(Integer) param);
		else if (param.getClass() == String.class)
			achievCat1 = (AchievCat1) db.session.createQuery("from "
					+ AchievCat1.class + " where NameEng='" + param + "'");
		else
			System.out.println("Type of param not supported.");
		return achievCat1;
	}

	/**
	 * Returns all AchievCat1s.
	 * 
	 * @return ArrayList< AchievCat1>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<AchievCat1> getAchievCat1s() {
		ArrayList<AchievCat1> arrayList = null;
		DB db = new DB();
		arrayList = (ArrayList<AchievCat1>) db.session.createQuery(
				"from " + AchievCat1.class).list();
		return arrayList;
	}

	/**
	 * returns all AchievCat1s of AchievCat achievCat.
	 * 
	 * @param achievCat
	 * @return ArrayList< AchievCat1>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<AchievCat1> getAchievCat1s(AchievCat achievCat) {
		ArrayList<AchievCat1> arrayList = null;
		DB db = new DB();
		arrayList = (ArrayList<AchievCat1>) db.session.createQuery(
				"from " + AchievCat1.class + " where AchievCat="
						+ achievCat.getId()).list();
		return arrayList;
	}

	/**
	 * Sets all AchievCat1s in ArrayList arrayList.
	 * 
	 * @param arrayList
	 */
	public void setAchievCat1s(ArrayList<AchievCat1> arrayList) {
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			for (AchievCat1 achievCat1 : arrayList)
				db.session.saveOrUpdate(achievCat1);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}

	/**
	 * Sets AchievCat1 achievCat1.
	 * 
	 * @param achievCat1
	 */
	public void setAchievCat1(AchievCat1 achievCat1) {
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			db.session.saveOrUpdate(achievCat1);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
}
