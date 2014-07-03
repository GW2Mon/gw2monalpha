package org.GW2Mon.dao;

import java.util.ArrayList;

import org.GW2Mon.GW2Mon;
import org.GW2Mon.function.DB;
import org.GW2Mon.pojo.Account;
import org.GW2Mon.pojo.Charakter;
import org.hibernate.Transaction;

/**
 * @author GW2Mon[at]gmail.com
 * @version 0.0001
 */
public class CharakterDao {

	/**
	 * Returns the Charakter with Id or Name Char corresponding on Type of Char.
	 * 
	 * @param Char
	 * @return Charakter
	 */
	public Charakter getCharakter(Object Char) {
		Charakter charakter = null;
		DB db = new DB(GW2Mon.CharCfg, GW2Mon.CharPath);
		Transaction trans = db.session.beginTransaction();
		if (Char.getClass() == Integer.class)
			charakter = (Charakter) db.session.get(Charakter.class,
					(Integer) Char);
		else if (Char.getClass() == String.class)
			charakter = (Charakter) db.session.createQuery("from "
					+ Charakter.class + " where Name='" + Char + "'");
		trans.commit();
		return charakter;
	}

	/**
	 * Returns all Charakters.
	 * 
	 * @return ArrayList< Charakter>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Charakter> getCharakters() {
		ArrayList<Charakter> arrayList = null;
		DB db = new DB(GW2Mon.CharCfg, GW2Mon.CharPath);
		Transaction trans = db.session.beginTransaction();
		arrayList = (ArrayList<Charakter>) db.session.createQuery(
				"from " + Charakter.class.getSimpleName()).list();
		trans.commit();
		return arrayList;
	}

	/**
	 * Returns all Charakters of Account Acc.
	 * 
	 * @param Acc
	 * @return ArrayList< Charakter>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Charakter> getCharakters(Account Acc) {
		ArrayList<Charakter> arrayList = null;
		DB db = new DB(GW2Mon.CharCfg, GW2Mon.CharPath);
		Transaction trans = db.session.beginTransaction();
		arrayList = (ArrayList<Charakter>) db.session.createSQLQuery(
				"Select ch.* from " + Charakter.class.getSimpleName()
				+ " ch LEFT JOIN "+Account.class.getSimpleName()+" ac ON "
				+ "ac.Id = ch.Account where ac.Id =" + Acc.getId()).addEntity(Charakter.class).list();
		trans.commit();
		return arrayList;
	}

	/**
	 * Sets the Charakter or Charakter with Id Char corresponding on Type of
	 * Char.
	 * 
	 * @param Char
	 */
	public void setCharakter(Object Char) {
		DB db = new DB(GW2Mon.CharCfg, GW2Mon.CharPath);
		Transaction trans = db.session.beginTransaction();
		try {
			if (Char.getClass() == Charakter.class)
				db.session.saveOrUpdate(Char);
			else
				db.session.saveOrUpdate(getCharakter(Char));
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}

	/**
	 * Sets all Charakters in ArrayList arrayList.
	 * 
	 * @param arrayList
	 */
	public void setCharakters(ArrayList<Charakter> arrayList) {
		DB db = new DB(GW2Mon.CharCfg, GW2Mon.CharPath);
		Transaction trans = db.session.beginTransaction();
		try {
			for (Charakter Char : arrayList) {
				db.session.saveOrUpdate(Char);
			}
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
}