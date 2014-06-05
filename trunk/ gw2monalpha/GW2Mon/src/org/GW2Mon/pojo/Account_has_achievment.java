package org.GW2Mon.pojo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author GW2Mon[at]gmail.com
 * @version 0.0001
 */
@Entity
@Table(name="Account_has_Achievment")
public class Account_has_achievment implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@ManyToOne(targetEntity=Account.class, cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Account Account;
	@Id
	@ManyToOne(targetEntity=Achievment.class, cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Achievment Achievment;

	/**
	 * @param achievment 
	 * @param account 
	 * @category constructor
	 */
	public Account_has_achievment(Account account, Achievment achievment) {
		this.setAccount(account);
		this.setAchievment(achievment);
	}

	/**
	 * @category getter
	 * @return Achievment
	 */
	public Achievment getAchievment() {
		return this.Achievment;
	}

	/**
	 * @category setter
	 * @param achievment
	 */
	public void setAchievment(Achievment achievment) {
		this.Achievment = achievment;
	}

	/**
	 * @category getter
	 * @return Account
	 */
	public Account getAccount() {
		return Account;
	}

	/**
	 * @category setter
	 * @param account
	 */
	public void setAccount(Account account) {
		Account = account;
	}

	@Override
	public String toString() {
		return "Account_has_achievment [Account=" + Account + ", Achievment="
				+ Achievment + "]";
	}

}
