package org.GW2Mon.dao;

import java.util.ArrayList;

import org.GW2Mon.function.DB;
import org.GW2Mon.pojo.CraftingDiscipline;
import org.hibernate.Transaction;

public class CraftingDisciplineDao {

	/**
	 * Returns CraftingDiscipline with Id id.
	 * 
	 * @param id
	 * @return CraftingDiscipline
	 */
	public CraftingDiscipline getCraftingDiscipline(int id) {
		CraftingDiscipline craftDisc = null;
		DB db = new DB();
		craftDisc = (CraftingDiscipline) db.session.get(
				CraftingDiscipline.class, id);
		return craftDisc;
	}

	/**
	 * Returns all CraftingDisciplines.
	 * 
	 * @return ArrayList< CraftingDiscipline>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<CraftingDiscipline> getCraftingDisciplines() {
		ArrayList<CraftingDiscipline> arrayList = null;
		DB db = new DB();
		arrayList = (ArrayList<CraftingDiscipline>) db.session.createQuery(
				"from " + CraftingDiscipline.class).list();
		return arrayList;
	}

	/**
	 * Sets CraftingDiscipline param.
	 * 
	 * @param craftingDiscipline
	 */
	public void setCraftingDiscipline(CraftingDiscipline param) {
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			db.session.saveOrUpdate(param);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}

	/**
	 * Sets all CraftingDisciplines in ArrayList arrayList.
	 * 
	 * @param arryList
	 */
	public void setCraftingDisciplines(ArrayList<CraftingDiscipline> arryList) {
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			for (CraftingDiscipline craftingDiscipline : arryList)
				db.session.saveOrUpdate(craftingDiscipline);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}

}
