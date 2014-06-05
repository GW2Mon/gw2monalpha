package org.GW2Mon.service;

import java.util.ArrayList;

import org.GW2Mon.dao.TraitDao;
import org.GW2Mon.pojo.Trait;

public class TraitService {

	private TraitDao traitDao = new TraitDao();
	
	/**
	 * Saves all Traits.
	 */
	public void SaveTraits(){
		traitDao.setTraits(traitDao.getTraits());
	}
	
	/**
	 * Saves Traits in ArrayList arrayList.
	 * @param arrayList
	 */
	public void SaveTraits(ArrayList<Trait> arrayList){
		traitDao.setTraits(arrayList);
	}
	
	/**
	 * Saves Trait trait.
	 * @param trait
	 */
	public void SaveTrait(Trait trait){
		traitDao.setTrait(trait);
	}
	
	/**
	 * Loads all Traits.
	 * @return ArrayList< Trait>
	 */
	public ArrayList<Trait> LoadTraits(){
		return traitDao.getTraits();
	}
	
	/**
	 * Loads Trait with Id or NameEng param
	 * corresponding on Type of param.
	 * @param param
	 * @return Trait
	 */
	public Trait loadTrait(Object param){
		return traitDao.getTrait(param);
	}
}
