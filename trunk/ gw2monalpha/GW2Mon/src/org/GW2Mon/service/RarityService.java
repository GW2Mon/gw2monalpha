package org.GW2Mon.service;

import java.util.ArrayList;

import org.GW2Mon.dao.RarityDao;
import org.GW2Mon.pojo.Rarity;

public class RarityService {

	private RarityDao rarityDao = new RarityDao();
	
	/**
	 * Saves Rarity rarity.
	 * @param rarity
	 */
	public void saveRarity(Rarity rarity){
		rarityDao.setRarity(rarity);
	}
	
	/**
	 * Saves all Rarities.
	 */
	public void saveRarities(){
		rarityDao.setRarities(rarityDao.getRarities());
	}
	
	/**
	 * Saves Rarities in ArrayList arrayList.
	 * @param arrayList
	 */
	public void saveRarities(ArrayList<Rarity> arrayList){
		rarityDao.setRarities(arrayList);
	}
	
	/**
	 * Loads Rarity with Id id.
	 * @param id
	 * @return Rarity
	 */
	public Rarity loadRarity(int id){
		return rarityDao.getRarity(id);
	}
	
	/**
	 * Loads all Rarities.
	 * @return ArrayList< Rarity>
	 */
	public ArrayList<Rarity> loadRarities(){
		return rarityDao.getRarities();
	}
}
