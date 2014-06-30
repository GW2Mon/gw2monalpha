package org.GW2Mon.dao;

import java.util.ArrayList;

import org.GW2Mon.GW2Mon;
import org.GW2Mon.model.DB;
import org.GW2Mon.pojo.Account;
import org.hibernate.Transaction;

public class AccountDao {

	/**
	 * Returns Account with ID or Name Acc corresponding on Type of Acc
	 * 
	 * @param Acc
	 * @return Account
	 */
	public Account getAccount(Object Acc) {
		Account account = null;
		DB db = new DB(GW2Mon.AccCfg, GW2Mon.AccPath);
		Transaction trans = db.session.beginTransaction();		
		if (Acc.getClass() == Integer.class)
			account = (Account) db.session.get(Account.class, (Integer) Acc);
		else if (Acc.getClass() == String.class)
			account = (Account) db.session.createQuery("from"
					+ Account.class.getSimpleName() + " where Name='" + Acc
					+ "'");
		else
			System.out.println("Unsupported Type for Acc");
		trans.commit();
		return account;
	}

	/**
	 * Returns all Accounts.
	 * 
	 * @return ArrayList< Account>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Account> getAccounts() {
		ArrayList<Account> arrayList = null;
		DB db = new DB(GW2Mon.AccCfg, GW2Mon.AccPath);
		Transaction trans = db.session.beginTransaction();
		arrayList = (ArrayList<Account>) db.session
				.createSQLQuery(
						"Select * from " + Account.class.getSimpleName())
				.addEntity(Account.class).list();
		trans.commit();
		return arrayList;
	}

	/**
	 * Sets Account acc to database.
	 * 
	 * @param acc
	 */
	public void setAccount(Account acc) {
		DB db = new DB(GW2Mon.AccCfg, GW2Mon.AccPath);
		Transaction trans = db.session.beginTransaction();
		try {
			db.session.saveOrUpdate(acc);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}

	/**
	 * Sets all Accounts in ArrayList arrayList to the database.
	 * 
	 * @param arrayList
	 */
	public void setAccounts(ArrayList<Account> arrayList) {
		DB db = new DB(GW2Mon.AccCfg, GW2Mon.AccPath);
		Transaction trans = db.session.beginTransaction();
		try {
			for (Account acc : arrayList) {
				db.session.saveOrUpdate(acc);
			}
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
}
