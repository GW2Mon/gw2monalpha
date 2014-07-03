package org.GW2Mon.dao;

import java.util.ArrayList;

import org.GW2Mon.function.DB;
import org.GW2Mon.pojo.Attribute;
import org.hibernate.Transaction;

public class AttributeDao {

	/**
	 * Returns ArrayList with all Attributes.
	 * 
	 * @return ArrayList< Attribute>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Attribute> getAttributes() {
		ArrayList<Attribute> arrayList = new ArrayList<Attribute>();
		DB db = new DB();
		arrayList = (ArrayList<Attribute>) db.session.createQuery(
				"from " + Attribute.class).list();
		return arrayList;
	}

	/**
	 * Returns Attribute with Id or NameEng param corresponding on Type of
	 * param.
	 * 
	 * @param param
	 * @return Attribute
	 */
	public Attribute getAttribute(Object param) {
		Attribute attribute = null;
		DB db = new DB();
		if (param.getClass() == Integer.class)
			attribute = (Attribute) db.session.get(
					org.GW2Mon.pojo.Attribute.class, (Integer) param);
		else
			attribute = (Attribute) db.session.createQuery(
					"from Attribute where NameEng='" + param
							+ "' collate nocase").uniqueResult();
		return attribute;
	}

	/**
	 * Returns all Attributes with Type type
	 * 
	 * @param Type
	 * @return ArrayList< Attribute>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Attribute> getAttributes(int type) {
		ArrayList<Attribute> arrayList = null;
		DB db = new DB();
		arrayList = (ArrayList<Attribute>) db.session.createQuery(
				"from " + Attribute.class + " where Type=" + type).list();
		return arrayList;
	}

	/**
	 * Sets Attribute att.
	 * 
	 * @param att
	 */
	public void setAttribute(Attribute att) {
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			db.session.saveOrUpdate(att);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}

	/**
	 * Sets all Attributes in ArrayList arrayList.
	 * 
	 * @param arrayList
	 */
	public void setAttributes(ArrayList<Attribute> arrayList) {
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			for (Attribute attribute : arrayList)
				db.session.saveOrUpdate(attribute);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}

}
