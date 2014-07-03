package org.GW2Mon.service;

import java.util.ArrayList;

import org.GW2Mon.dao.AttributeDao;
import org.GW2Mon.pojo.Attribute;

public class AttributeService {

	private AttributeDao attributeDao = new AttributeDao();

	/**
	 * Saving all Atributes.
	 */
	public void saveAttributes() {
		attributeDao.setAttributes(attributeDao.getAttributes());
	}

	/**
	 * 
	 * @param type
	 */
	public void saveAttributes(int type) {
		attributeDao.setAttributes(attributeDao.getAttributes(type));
	}

	/**
	 * Saving all Attributes in ArrayList arrayList.
	 * 
	 * @param arrayList
	 */
	public void saveAttributes(ArrayList<Attribute> arrayList) {
		attributeDao.setAttributes(arrayList);
	}

	/**
	 * Loading Attribute with Id or NameEng param corresponding on Type of
	 * param.
	 * 
	 * @param param
	 * @return Attribute
	 */
	public Attribute loadAttribute(Object param) {
		return attributeDao.getAttribute(param);
	}

	public ArrayList<Attribute> loadAttributes() {
		return attributeDao.getAttributes();
	}

	public ArrayList<Attribute> loadAttributes(int type) {
		return attributeDao.getAttributes(type);
	}
}
