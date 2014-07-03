package org.GW2Mon.dao;

import java.util.ArrayList;

import org.GW2Mon.function.DB;
import org.GW2Mon.pojo.Trait;
import org.hibernate.Transaction;

public class TraitDao {

	/**
	 * Returns Trait with Id or NameEng param corresponding on Type of param.
	 * 
	 * @param param
	 * @return Trait
	 */
	public Trait getTrait(Object param) {
		Trait trait = null;
		DB db = new DB();
		if (param.getClass() == Integer.class)
			trait = (Trait) db.session.get(Trait.class, (Integer) param);
		else if (param.getClass() == String.class)
			trait = (Trait) db.session.createQuery(
					"from " + Trait.class + "where NameEng='" + param + "'")
					.uniqueResult();
		else
			System.out.println("Type of param not supported.");
		return trait;
	}

	/**
	 * Returns all Traits.
	 * 
	 * @return ArrayList< Trait>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Trait> getTraits() {
		ArrayList<Trait> arrayList = null;
		DB db = new DB();
		arrayList = (ArrayList<Trait>) db.session.createQuery(
				"from " + Trait.class).list();
		return arrayList;
	}

	/**
	 * Sets Trait trait.
	 * 
	 * @param trait
	 */
	public void setTrait(Trait trait) {
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			db.session.saveOrUpdate(trait);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}

	/**
	 * Sets all Traits in ArrayList arrayList.
	 * 
	 * @param traits
	 */
	public void setTraits(ArrayList<Trait> arrayList) {
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			for (Trait trait : arrayList) {
				db.session.saveOrUpdate(trait);
			}
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}

}
