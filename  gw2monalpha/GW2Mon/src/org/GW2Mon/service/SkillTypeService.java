package org.GW2Mon.service;

import java.util.ArrayList;

import org.GW2Mon.dao.SkilltypeDao;
import org.GW2Mon.pojo.Skilltype;

public class SkillTypeService {

	private SkilltypeDao skilltypeDao = new SkilltypeDao();
	
	/**
	 * Saves all Skilltypes.
	 */
	public void saveSkillTypes(){
		skilltypeDao.setSkilltypes(skilltypeDao.getSkilltypes());
	}
	
	/**
	 * Saves all Skilltypes in ArrayList arrayList.
	 * @param arrayList
	 */
	public void SaveSkillType(ArrayList<Skilltype> arrayList){
		skilltypeDao.setSkilltypes(arrayList);
	}
	
	/**
	 * Saves Skilltype skilltype.
	 * @param skilltype
	 */
	public void SaveSkillType(Skilltype skilltype){
		skilltypeDao.setSkilltype(skilltype);
	}
	
	/**
	 * Loads Skilltype with Id id.
	 * @param id
	 * @return Skilltype
	 */
	public Skilltype loadSkilltype(int id){
		return skilltypeDao.getSkilltype(id);
	}
	
	/**
	 * Loads all Skilltypes.
	 * @return ArrayList< Skilltype>
	 */
	public ArrayList<Skilltype> loadSkillTypes(){
		return skilltypeDao.getSkilltypes();
	}
}
