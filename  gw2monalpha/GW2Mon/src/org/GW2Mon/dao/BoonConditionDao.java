package org.GW2Mon.dao;

import java.util.ArrayList;

import org.GW2Mon.function.DB;
import org.GW2Mon.pojo.BoonCondition;
import org.hibernate.Transaction;

public class BoonConditionDao {

	/**
	 * Returns BoonCondition with Id id.
	 * 
	 * @param id
	 * @return BoonCondition
	 */
	public BoonCondition getBoonCondition(int id) {
		BoonCondition boonCondition = null;
		DB db = new DB();
		boonCondition = (BoonCondition) db.session.get(BoonCondition.class, id);
		return boonCondition;
	}

	/**
	 * Returns all BoonConditions.
	 * 
	 * @return ArrayList< BoonCondition>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<BoonCondition> getBooConditions() {
		ArrayList<BoonCondition> arrayList = null;
		DB db = new DB();
		arrayList = (ArrayList<BoonCondition>) db.session.createQuery(
				"from " + BoonCondition.class).list();
		return arrayList;
	}

	/**
	 * Sets BoonCondition BoCo.
	 * 
	 * @param BoCo
	 */
	public void setBoonCondition(BoonCondition BoCo) {
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			db.session.saveOrUpdate(BoCo);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}

	/**
	 * Sets all BoonCondition in the ArrayList arrayList.
	 * 
	 * @param arrayList
	 */
	public void setBoonConditions(ArrayList<BoonCondition> arrayList) {
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			for (BoonCondition BoCo : arrayList)
				db.session.saveOrUpdate(BoCo);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
}
