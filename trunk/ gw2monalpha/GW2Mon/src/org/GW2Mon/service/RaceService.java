package org.GW2Mon.service;

import java.util.ArrayList;

import org.GW2Mon.dao.RaceDao;
import org.GW2Mon.pojo.Race;

public class RaceService {

	private RaceDao raceDao = new RaceDao();

	/**
	 * Saving Race race.
	 * 
	 * @param race
	 */
	public void saveRace(Race race) {
		raceDao.setRace(race);
	}

	/**
	 * Saving all Races in ArrayList arrayList.
	 * 
	 * @param arrayList
	 */
	public void saveRaces(ArrayList<Race> arrayList) {
		raceDao.setRaces(arrayList);
	}

	/**
	 * Loading Race.
	 * 
	 * @param param
	 * @return Race
	 */
	public Race loadRace(Object param) {
		return raceDao.getRace(param);
	}

	/**
	 * Loading all Races.
	 * 
	 * @return ArrayList< Race>
	 */
	public ArrayList<Race> loadRaces() {
		return raceDao.getRaces();
	}

}
