package org.GW2Mon.service;

import java.util.ArrayList;

import org.GW2Mon.dao.BoonConditionDao;
import org.GW2Mon.pojo.BoonCondition;

public class BoonConditionService {

	private BoonConditionDao bcDao = new BoonConditionDao();

	public void saveBoonConditions() {
		bcDao.setBoonConditions(bcDao.getBooConditions());
	}

	public void saveBoonConditions(ArrayList<BoonCondition> arrayList) {
		bcDao.setBoonConditions(arrayList);
	}

	public void saveBoonCondition(BoonCondition BoCo) {
		bcDao.setBoonCondition(BoCo);
	}

	public void saveBoonCondition(int id) {
		bcDao.setBoonCondition(bcDao.getBoonCondition(id));
	}

	public BoonCondition loadBoonCondition(int id) {
		return bcDao.getBoonCondition(id);
	}

	public ArrayList<BoonCondition> loadBoonConditions() {
		return bcDao.getBooConditions();
	}
}
