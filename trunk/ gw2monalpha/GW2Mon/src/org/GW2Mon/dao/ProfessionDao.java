package org.GW2Mon.dao;

import java.util.ArrayList;

import org.GW2Mon.model.DB;
import org.GW2Mon.pojo.Profession;
import org.hibernate.Transaction;

public class ProfessionDao {

	/**
	 * Returns Profession with Id or NameEng param
	 * corresponding on Type of param.
	 * @param param
	 * @return Profession
	 */
	public Profession getProfession(Object param) {
		Profession profession = null;
		DB db = new DB();
		if (param.getClass()==Integer.class)
		profession = (Profession) db.session.get(Profession.class,(Integer) param);
		else if(param.getClass()==String.class)
			profession = (Profession) db.session.createQuery("from "
					+ Profession.class + " where NameEng='" + (String) param
					+ "'");
		else System.out.println("Type of param not supported.");
		return profession;
	}

	/**
	 * Returns all Professions.
	 * @return ArrayList< Profession>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Profession> getProfessions() {
		ArrayList<Profession> arrayList = null;
		DB db = new DB();
		arrayList = (ArrayList<Profession>) db.session.createQuery(
				"from " + Profession.class).list();
		return arrayList;
	}

	/**
	 * Sets all Professions in ArrayList arrayList
	 * @param arrayList
	 */
	public void setProfessions(ArrayList<Profession> arrayList){
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			for (Profession prof : arrayList)
				db.session.saveOrUpdate(prof);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
	
	/**
	 * Sets Profession prof.
	 * @param prof
	 */
	public void setProfession(Profession prof){
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			db.session.saveOrUpdate(prof);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
	
}
