package org.GW2Mon.service;

import java.util.ArrayList;

import org.GW2Mon.dao.EquipmentDao;
import org.GW2Mon.pojo.Equipment;

public class EquipmentService {

	private EquipmentDao EquipDao = new EquipmentDao();

	public ArrayList<Equipment> loadEquipments(Object Equip) {
		return EquipDao.getEquipments(Equip);
	}

	public void saveEquipment(Equipment Equip) {
		EquipDao.setEquipment(Equip);
	}

}
