package org.GW2Mon.service;

import java.util.ArrayList;

import org.GW2Mon.dao.SkillDao;
import org.GW2Mon.pojo.Skill;

public class SkillService {

	private SkillDao skillDao = new SkillDao();
	
	/**
	 * Saves Skill skill
	 * @param skill
	 */
	public void saveSkill(Skill skill){
		skillDao.setSkill(skill);
	}
	
	/**
	 * Saves all Skills.
	 */
	public void saveSkills(){
		skillDao.setSkills(skillDao.getSkills());
	}
	
	/**
	 * Saves all Skills in ArrayList arrayList.
	 * @param arrayList
	 */
	public void saveSkills(ArrayList<Skill> arrayList){
		skillDao.setSkills(arrayList);
	}
	
	/**
	 * Loads Skill with Id or NameEng param
	 * corresponding on Type of param.
	 * @param param
	 * @return Skill
	 */
	public Skill loadSkill(Object param){
		return skillDao.getSkill(param);
	}
	
	/**
	 * Loads all Skills
	 * @return ArrayList< Skill>
	 */
	public ArrayList<Skill> loadSkills(){
		return skillDao.getSkills();
	}
}
