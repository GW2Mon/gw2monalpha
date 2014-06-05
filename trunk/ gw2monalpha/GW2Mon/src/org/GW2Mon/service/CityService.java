package org.GW2Mon.service;

import java.util.ArrayList;

import org.GW2Mon.dao.CityDao;
import org.GW2Mon.pojo.City;

public class CityService {

	private CityDao cityDao = new CityDao();
	
	public void saveCities(){
		cityDao.setCities(cityDao.getCities());
	}
	
	public void saveCity(City city){
		cityDao.setCity(city);
	}
	
	public void saveCity(int id){
		cityDao.getCity(id);
	}
	
	public void saveCities(ArrayList<City> arrayList){
		cityDao.setCities(arrayList);
	}
	
	public ArrayList<City> loadCities(){
		return cityDao.getCities();
	}
	
	public City loadCity(int id){
		return cityDao.getCity(id);
	}
}
