package org.GW2Mon.service;

import java.util.ArrayList;

import org.GW2Mon.dao.AccountDao;
import org.GW2Mon.pojo.Account;

public class AccountService {

	private AccountDao AccDao = new AccountDao();

	/**
	 * Saves the Account with Id or Name Acc corresponding on Type of Acc.
	 * 
	 * @param Acc
	 */
	public void saveAccount(Object Acc) {
		AccDao.setAccount(AccDao.getAccount(Acc));
	}

	/**
	 * Saves all Accounts
	 */
	public void saveAccounts() {
		AccDao.setAccounts(AccDao.getAccounts());
	}

	/**
	 * Saves all Accounts in the ArrayList
	 * 
	 * @param arrayList
	 */
	public void saveAccounts(ArrayList<Account> arrayList) {
		AccDao.setAccounts(arrayList);
	}

	/**
	 * Loads all Accounts
	 * 
	 * @return ArrayList< Account>
	 */
	public ArrayList<Account> loadAccounts() {
		return AccDao.getAccounts();
	}

	/**
	 * Loads the Account with Id or Name Acc corresponding on Type of Acc
	 * 
	 * @param Acc
	 * @return Account
	 */
	public Account loadAccount(Object Acc) {
		return AccDao.getAccount(Acc);
	}
}
