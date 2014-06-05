package org.GW2Mon.dao;

import java.util.ArrayList;

import org.GW2Mon.model.DB;
import org.GW2Mon.pojo.Account;
import org.GW2Mon.pojo.Account_has_achievment;
import org.GW2Mon.pojo.Achievment;
import org.hibernate.Transaction;

public class Account_has_achievmentDao {
	
	/**
	 * Returns all Account_has_Achievments with Account or Achievment param
	 * corresponding on Type of param.
	 * @param param
	 * @return ArrayList< Account_has_Achievment>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Account_has_achievment> getAccount_has_achievments(Object param){
		ArrayList<Account_has_achievment> arrayList=null;
		DB db= new DB("Account");
		if (param.getClass()==Account.class)
		arrayList = (ArrayList<Account_has_achievment>) db.session.createQuery("from " + Account_has_achievment.class + " where Account="+((Account) param).getId()).list();
		if (param.getClass()==Achievment.class)
			arrayList=(ArrayList<Account_has_achievment>) db.session.createQuery("from "+Account_has_achievment.class+"where Achievment="+((Achievment) param).getId()).list();
		return arrayList;
	}
		
	/**
	 * Returns Account_has_Achievment for Account Acc and Achievment Achiev.
	 * @param Acc
	 * @param Achiev
	 * @return Account_has_Achievment
	 */
	public Account_has_achievment getAccount_has_Achievment(Account Acc, Achievment Achiev){
		Account_has_achievment Acc_has_Achiev=null;
		DB db = new DB("Account");
		Acc_has_Achiev=(Account_has_achievment) db.session.createQuery("from" + Account_has_achievment.class + "where Account ="+Acc.getId()+" and Achievment=" +Achiev.getId());
		return Acc_has_Achiev;
	}
	
	/**
	 * Sets Account_has Achievment Acc_has_Achiev.
	 * @param Acc_has_Achiev
	 */
	public void setAccount_has_Achievment(Account_has_achievment Acc_has_Achiev){
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			db.session.saveOrUpdate(Acc_has_Achiev);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
	
	/**
	 * Sets Account_has_Achievment for all Account_has_Achievment in ArrayList arrayList.
	 * @param arrayList
	 */
	public void setAccount_has_Achievments(ArrayList<Account_has_achievment> arrayList){
		DB db = new DB("Account");
		Transaction trans = db.session.beginTransaction();
		try {
			for (Account_has_achievment Acc_has_Achiev : arrayList)
				db.session.saveOrUpdate(Acc_has_Achiev);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
}
