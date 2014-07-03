package org.GW2Mon.service;

import java.util.ArrayList;

import org.GW2Mon.dao.AchievmentDao;
import org.GW2Mon.pojo.Achievment;

public class AchievmentService {

	private AchievmentDao achievDao = new AchievmentDao();

	/**
	 * Saving all Achievments.
	 */
	public void saveAchievments() {
		achievDao.setAchievments(achievDao.getAchievments());
	}

	/**
	 * Saving all Achievments in ArrayList arrayList.
	 * 
	 * @param arrayList
	 */
	public void saveAchievments(ArrayList<Achievment> arrayList) {
		achievDao.setAchievments(arrayList);
	}

	/**
	 * Saving Achievment achiev.
	 * 
	 * @param achiev
	 */
	public void saveAchievment(Object achiev) {
		if (achiev.getClass() == Achievment.class)
			achievDao.setAchievment((Achievment) achiev);
		else if (achiev.getClass() == Integer.class)
			achievDao.setAchievment(achievDao.getAchievment((int) achiev));
	}

	/**
	 * Loading Achievment with Id id.
	 * 
	 * @param id
	 * @return Achievment
	 */
	public Achievment loadAchievment(int id) {
		return achievDao.getAchievment(id);
	}

	/**
	 * Loading Achievments with AchievCat or AchievCat1 param corresponding on
	 * Type of param.
	 * 
	 * @param param
	 * @return ArrayList< Achievment>
	 */
	public ArrayList<Achievment> loadAchievments(Object param) {
		return achievDao.getAchievments(param);
	}

	/**
	 * Loading all Achievments.
	 * 
	 * @return
	 */
	public ArrayList<Achievment> loadAchievments() {
		return achievDao.getAchievments();
	}

	/**
	 * Loading Achievments with AchievCat and AchievCat1 or NameGer and NameEng
	 * corresponding on Type of param1 and param2.
	 * 
	 * @param param1
	 * @param param2
	 * @return
	 */
	public ArrayList<Achievment> loadAchievments(Object param1, Object param2) {
		return achievDao.getAchievments(param1, param2);
	}

}
