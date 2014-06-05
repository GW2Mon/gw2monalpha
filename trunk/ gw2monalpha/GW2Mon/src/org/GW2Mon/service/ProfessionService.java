package org.GW2Mon.service;

import java.util.ArrayList;

import org.GW2Mon.dao.ProfessionDao;
import org.GW2Mon.pojo.Profession;

public class ProfessionService {

	private ProfessionDao profDao = new ProfessionDao();
	
	public void saveProfessions(ArrayList<Profession> arrayList){
		profDao.setProfessions(arrayList);
	}
	
	public void saveProfessions(){
		profDao.setProfessions(profDao.getProfessions());
	}
	
	public void saveProfession(Profession prof){
		profDao.setProfession(prof);
	}
	
	public void saveProfession(Object param){
		profDao.setProfession(profDao.getProfession(param));
	}
}
