package org.GW2Mon.service;

import java.util.ArrayList;

import org.GW2Mon.dao.CharakterDao;
import org.GW2Mon.pojo.Account;
import org.GW2Mon.pojo.Charakter;

/**
 * @author GW2Mon[at]gmail.com 
 *
 */
public class CharacterService {

	private CharakterDao CharDao=new CharakterDao();

	/**
	 * Saves all Charakters
	 */
	public void saveCharakters(){
		CharDao.setCharakters(CharDao.getCharakters());
	}
	
	/**
	 * Saves all Charakters in the ArrayList
	 * @param arrayList
	 */
	public void saveCharakters(ArrayList<Charakter> arrayList){
		CharDao.setCharakters(arrayList);
	}

	/**
	 * Saves all Charakters of Account Acc
	 * @param Acc
	 */
	public void saveCharakters(Account Acc){
		CharDao.setCharakters(CharDao.getCharakters(Acc));
	}
	
	/**
	 * Saves the Charakter Char
	 * @param Char
	 */
	public void saveCharakter(Object Char){
		CharDao.setCharakter(Char);	
	}
	
	/**
	 * Loads the Charakter with Id or Name Char 
	 * corresponding on Type of Char
	 * @param Char
	 * @return Charakter
	 */
	public Charakter loadCharakter(Object Char){
		return CharDao.getCharakter(Char);
	}
	
	/**
	 * Loads all Charakters
	 * @return Charakter
	 */
	public ArrayList<Charakter> loadCharakters(){
		return CharDao.getCharakters();
	}
	
	/**
	 * Loads all Charakters of Account Acc
	 * @param Acc
	 * @return Charakter
	 */
	public ArrayList<Charakter> loadCharakters(Account Acc){
		return CharDao.getCharakters(Acc);
	}
}
