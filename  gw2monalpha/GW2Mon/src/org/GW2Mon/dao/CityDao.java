package org.GW2Mon.dao;

import java.util.ArrayList;

import org.GW2Mon.model.DB;
import org.GW2Mon.pojo.City;
import org.hibernate.Transaction;

public class CityDao {

	/**
	 * Returns City with Id id.
	 * @param id
	 * @return City
	 */
	public City getCity(int id) {
		City city = null;
		DB db = new DB();
		city = (City) db.session.get(City.class, id);
		return city;
	}

	/**
	 * Returns all Cities.
	 * @return ArrayList< City>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<City> getCities() {
		ArrayList<City> arrayList = null;
		DB db = new DB();
		arrayList = (ArrayList<City>) db.session.createQuery(
				"from" + City.class).list();
		return arrayList;
	}

	/**
	 * Sets City or City with Id param
	 * corresponding on Type of para..
	 * @param param
	 */
	public void setCity(Object param) {
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			if (param.getClass()==City.class)
			db.session.saveOrUpdate(param);
			else if(param.getClass()==Integer.class)
				db.session.saveOrUpdate(getCity((int) param));
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}

	/**
	 * Sets all Cities in ArrayList arrayList.
	 * @param arryList
	 */
	public void setCities(ArrayList<City> arryList) {
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			for (City city : arryList)
				db.session.saveOrUpdate(city);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
}
