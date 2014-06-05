package org.GW2Mon.dao;

import java.util.ArrayList;

import org.GW2Mon.model.DB;
import org.GW2Mon.pojo.Gender;
import org.hibernate.Transaction;

public class GenderDao {

	/**
	 * Returns Gender with Id param.
	 * @param param
	 * @return Gender
	 */
	public Gender getGender(Object param){
		Gender gender = null;
		DB db=new DB();
		if (param.getClass()==Integer.class)
		gender=(Gender) db.session.get(Gender.class,(Integer) param);
		return gender;
	}
	
	/**
	 * Returns all Genders.
	 * @return ArrayList< Gender>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Gender> getGenders(){
		ArrayList<Gender> arrayList = null;
		DB db=new DB();
		arrayList=(ArrayList<Gender>) db.session.createQuery("from "+Gender.class).list();
		return arrayList;
	}
	
	/**
	 * Sets Gender gender.
	 * @param gender
	 */
	public void setGender(Gender gender){
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			db.session.saveOrUpdate(gender);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
	
	/**
	 * Sets all Genders in ArrayList arrayList.
	 * @param arrayList
	 */
	public void setGenders(ArrayList<Gender> arrayList){
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			for (Gender gender : arrayList)
				db.session.saveOrUpdate(gender);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
	
}
