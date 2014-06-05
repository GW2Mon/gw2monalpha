package org.GW2Mon.dao;

import java.util.ArrayList;

import org.GW2Mon.model.DB;
import org.GW2Mon.pojo.Skilltype;
import org.hibernate.Transaction;

public class SkilltypeDao {

	/**
	 * Returns Skilltype with Id id.
	 * @param id
	 * @return Skilltype
	 */
	public Skilltype getSkilltype(int id){
		Skilltype skilltype = null;
		DB db=new DB();
		skilltype=(Skilltype) db.session.get(Skilltype.class, id);
		return skilltype;
	}
	
	/**
	 * Returns all Skilltypes.
	 * @return ArrayList< Skilltype>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Skilltype> getSkilltypes(){
		ArrayList<Skilltype> arrayList = null;
		DB db=new DB();
		arrayList=(ArrayList<Skilltype>) db.session.createQuery("from "+Skilltype.class).list();
		return arrayList;
	}
	
	/**
	 * Sets Skilltype skilltype.
	 * @param skilltype
	 */
	public void setSkilltype(Skilltype skilltype){
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			db.session.saveOrUpdate(skilltype);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
	
	/**
	 * Sets all Skilltypes in ArrayList arrayList.
	 * @param arrayList
	 */
	public void setSkilltypes(ArrayList<Skilltype> arrayList){
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			for (Skilltype skilltype : arrayList)
				db.session.saveOrUpdate(skilltype);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
}
