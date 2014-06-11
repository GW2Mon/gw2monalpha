package org.GW2Mon.dao;

import java.util.ArrayList;

import org.GW2Mon.GW2Mon;
import org.GW2Mon.model.DB;
import org.GW2Mon.pojo.Achievment;
import org.GW2Mon.pojo.Charakter;
import org.GW2Mon.pojo.Charakter_has_achievment;
import org.hibernate.Transaction;

public class Charakter_has_AchievmentDao {

	@SuppressWarnings("unchecked")
	public ArrayList<Charakter_has_achievment> getCharakter_has_Achievments() {
		ArrayList<Charakter_has_achievment> arrayList = null;
		DB db = new DB(GW2Mon.CharCfg,GW2Mon.CharPath);
		arrayList = (ArrayList<Charakter_has_achievment>) db.session
				.createQuery("from " + Charakter_has_achievment.class).list();
		return arrayList;
	}

	public Charakter_has_achievment getCharkter_has_Achievment(Charakter Char,
			Achievment Achiev) {
		Charakter_has_achievment Char_has_Achiev = null;
		DB db = new DB(GW2Mon.CharCfg,GW2Mon.CharPath);
		Char_has_Achiev = (Charakter_has_achievment) db.session
				.createQuery("from " + Charakter_has_achievment.class
						+ " where Charakter=" + Char.getId()
						+ " and Achievment=" + Achiev.getId());
		return Char_has_Achiev;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Charakter_has_achievment> getCharakter_has_achievments(
			Object Param) {
		ArrayList<Charakter_has_achievment> arrayList = null;
		DB db = new DB(GW2Mon.CharCfg,GW2Mon.CharPath);
		if (Param.getClass() == Charakter.class)
			arrayList = (ArrayList<Charakter_has_achievment>) db.session
					.createQuery(
							"from" + Charakter_has_achievment.class
									+ "where Charakter="
									+ ((Charakter) Param).getId()).list();
		else if (Param.getClass() == Achievment.class)
			arrayList = (ArrayList<Charakter_has_achievment>) db.session
					.createQuery(
							"from " + Charakter_has_achievment.class
									+ " where Achievment="
									+ ((Achievment) Param).getId()).list();
		return arrayList;
	}
	
	public void setCharakter_has_Achievment(Charakter_has_achievment Char_has_Achiev){
		DB db = new DB(GW2Mon.CharCfg,GW2Mon.CharPath);
		Transaction trans = db.session.beginTransaction();
		try {
			db.session.saveOrUpdate(Char_has_Achiev);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
	
	public void setCharakter_has_Achievments(ArrayList<Charakter_has_achievment> arrayList){
		DB db = new DB(GW2Mon.CharCfg,GW2Mon.CharPath);
		Transaction trans = db.session.beginTransaction();
		try {
			for (Charakter_has_achievment Char_has_Achiev : arrayList)
				db.session.saveOrUpdate(Char_has_Achiev);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
}
