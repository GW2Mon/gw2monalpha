package org.GW2Mon.service;

import java.util.ArrayList;

import org.GW2Mon.dao.GenderDao;
import org.GW2Mon.pojo.Gender;

public class GenderService {

	private GenderDao genderDao = new GenderDao();
	
	public Gender loadGender(Object gender){
		return genderDao.getGender(gender);
	}
	
	public ArrayList<Gender> loadGenders(){
		return genderDao.getGenders();
	}
	
	public void saveGender(Gender gender){
		genderDao.setGender(gender);
	}
	
	public void saveGenders(ArrayList<Gender> arrayList){
		genderDao.setGenders(arrayList);
	}
}
