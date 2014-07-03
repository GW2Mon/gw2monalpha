package org.GW2Mon.dao;

import java.util.ArrayList;

import org.GW2Mon.function.DB;
import org.GW2Mon.pojo.Skill;
import org.hibernate.Transaction;

public class SkillDao {

	/**
	 * Returns Skill By Id or NameEng param corresponding on Type of param.
	 * 
	 * @param param
	 * @return Skill
	 */
	public Skill getSkill(Object param) {
		Skill skill = null;
		DB db = new DB();
		if (param.getClass() == Integer.class)
			skill = (Skill) db.session.get(Skill.class, (Integer) param);
		else if (param.getClass() == String.class)
			skill = (Skill) db.session.createQuery(
					"from " + Skill.class + " where NameEng='" + param + "'")
					.uniqueResult();
		else
			System.out.println("Type of param not supported.");
		return skill;
	}

	/**
	 * Returns all Skills
	 * 
	 * @return ArrayList< Skill>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Skill> getSkills() {
		ArrayList<Skill> arrayList = null;
		DB db = new DB();
		arrayList = (ArrayList<Skill>) db.session.createQuery(
				"from " + Skill.class).list();
		return arrayList;
	}

	/**
	 * Sets Skill skill.
	 * 
	 * @param skill
	 */
	public void setSkill(Skill skill) {
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			db.session.saveOrUpdate(skill);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}

	/**
	 * Sets all Skills in ArrayList arrayList.
	 * 
	 * @param arrayList
	 */
	public void setSkills(ArrayList<Skill> arrayList) {
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			for (Skill skill : arrayList)
				db.session.saveOrUpdate(skill);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}

}
