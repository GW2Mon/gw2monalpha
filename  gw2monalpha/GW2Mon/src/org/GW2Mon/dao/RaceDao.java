package org.GW2Mon.dao;

import java.util.ArrayList;

import org.GW2Mon.model.DB;
import org.GW2Mon.pojo.Race;
import org.hibernate.Transaction;

public class RaceDao {

	/**
	 * Returns Race with Id or NameEng param
	 * corresponding on Type of param. 
	 * @param param
	 * @return Race
	 */
	public Race getRace(Object param) {
		Race race = null;
		DB db = new DB();
		if (param.getClass() == Integer.class)
			race = (Race) db.session.get(Race.class, (Integer) param);
		else if (param.getClass() == String.class)
			race = (Race) db.session.createQuery("from " + Race.class
					+ " where NameEng='" + param + "'");
		else
			System.out.println("Type of param not supported.");
		return race;
	}

	/**
	 * Returns all Races.
	 * 
	 * @return ArrayList< Race>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Race> getRaces() {
		ArrayList<Race> arrayList = null;
		DB db = new DB();
		arrayList = (ArrayList<Race>) db.session.createQuery(
				"from " + Race.class).list();
		return arrayList;
	}

	/**
	 * Sets Race race.
	 * 
	 * @param race
	 */
	public void setRace(Race race) {
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			db.session.saveOrUpdate(race);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}

	/**
	 * Sets all Races in ArrayList arrayList.
	 * 
	 * @param arrayList
	 */
	public void setRaces(ArrayList<Race> arrayList) {
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			for (Race race : arrayList)
				db.session.saveOrUpdate(race);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
}
