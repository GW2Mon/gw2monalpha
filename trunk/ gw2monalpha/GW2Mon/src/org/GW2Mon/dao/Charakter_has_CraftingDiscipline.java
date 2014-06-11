package org.GW2Mon.dao;

import java.util.ArrayList;

import org.GW2Mon.GW2Mon;
import org.GW2Mon.model.DB;
import org.GW2Mon.pojo.Charakter;
import org.GW2Mon.pojo.CraftingDiscipline;
import org.hibernate.Transaction;

public class Charakter_has_CraftingDiscipline {

	@SuppressWarnings("unchecked")
	public ArrayList<Charakter_has_CraftingDiscipline> getCharakter_has_CraftingDisciplines(){
		ArrayList<Charakter_has_CraftingDiscipline> arrayList = null;
		DB db = new DB(GW2Mon.CharCfg,GW2Mon.CharPath);
		arrayList = (ArrayList<Charakter_has_CraftingDiscipline>) db.session.createQuery("from " + Charakter_has_CraftingDiscipline.class).list();
		return arrayList;
	}
	
	public Charakter_has_CraftingDiscipline getCharakter_has_CraftingDiscipline(Charakter Char, CraftingDiscipline CD){
		Charakter_has_CraftingDiscipline Char_has_CD=null;
		DB db = new DB(GW2Mon.CharCfg,GW2Mon.CharPath);
		Char_has_CD = (Charakter_has_CraftingDiscipline) db.session.createQuery("from " +Charakter_has_CraftingDiscipline.class+ " where Charakter="+Char+" and CraftingDiscipline="+CD);
		return Char_has_CD;		
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Charakter_has_CraftingDiscipline> getCharakter_has_CraftingDisciplines(Object Param){
		ArrayList<Charakter_has_CraftingDiscipline> arrayList=null;
		DB db = new DB(GW2Mon.CharCfg,GW2Mon.CharPath);
		if (Param.getClass()==Charakter.class)
		arrayList = (ArrayList<Charakter_has_CraftingDiscipline>) db.session.createQuery("from "+Charakter_has_CraftingDiscipline.class+" where Charakter="+((Charakter)Param).getId()).list();
		else if (Param.getClass()==CraftingDiscipline.class)
			arrayList = (ArrayList<Charakter_has_CraftingDiscipline>) db.session
					.createQuery(
							"from " + Charakter_has_CraftingDiscipline.class
									+ "where CraftingDiscipline="
									+ ((CraftingDiscipline) Param).getId())
					.list();
		return arrayList;
	}
	
	public void setCharakter_has_CraftingDisciplines(ArrayList<Charakter_has_CraftingDiscipline> arrayList){
		DB db = new DB(GW2Mon.CharCfg,GW2Mon.CharPath);
		Transaction trans = db.session.beginTransaction();
		try {
			for (Charakter_has_CraftingDiscipline Char_has_CD : arrayList)
				db.session.saveOrUpdate(Char_has_CD);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}		
	}
	
	public void setCharakter_has_CraftingDisciplines(Charakter Char,CraftingDiscipline CD){
		DB db = new DB(GW2Mon.CharCfg,GW2Mon.CharPath);
		Transaction trans = db.session.beginTransaction();
		try {
			db.session.saveOrUpdate(getCharakter_has_CraftingDiscipline(Char, CD));
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
}
