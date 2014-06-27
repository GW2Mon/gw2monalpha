package org.GW2Mon.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author GW2Mon[at]gmail.com
 * @version 0.0001
 */
@Entity
public class Account extends Object{
	private int Id, CountChar; 
	private Treasury Treasury;
	private String Name, EMail, PW, IgPW;

	/**
	 * @category constructor
	 * @param id
	 * @param name
	 * @param email
	 * @param pw
	 * @param igpw
	 * @param countchars
	 * @param treasury
	 */
	public Account(int id, String name, String email, String pw, String igpw,
			int countchar, Treasury treasury) {
		this.setId(id);
		this.setName(name);
		this.setCountChar(countchar);
		this.setEMail(email);
		this.setPW(pw);
		this.setIgPW(igpw);
		this.setTreasury(treasury);
	}

	/**
	 * @category getter
	 * @return Id
	 */
	@Id
	public int getId() {
		return this.Id;
	}

	/**
	 * @category setter
	 * @param id
	 */
	public void setId(int id) {
		this.Id = id;
	}

	/**
	 * @category getter
	 * @return CountChars
	 */
	public int getCountChar() {
		return CountChar;
	}

	/**
	 * @category setter
	 * @param countChars
	 */
	public void setCountChar(int countChar) {
		CountChar = countChar;
	}

	/**
	 * @category getter
	 * @return Name
	 */
	@Column(nullable=false)
	public String getName() {
		return Name;
	}

	/**
	 * @category setter
	 * @param name
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @category getter
	 * @return Treasury
	 */
	@ManyToOne(targetEntity=Treasury.class)
	public Treasury getTreasury() {
		return Treasury;
	}

	/**
	 * @category setter
	 * @param treasury
	 */
	public void setTreasury(Treasury treasury) {
		Treasury = treasury;
	}

	/**
	 * @category getter
	 * @return IgPW
	 */
	public String getIgPW() {
		return IgPW;
	}

	/**
	 * @category setter
	 * @param igPW
	 */
	public void setIgPW(String igPW) {
		IgPW = igPW;
	}

	/**
	 * @category getter
	 * @return Email
	 */
	@Column(nullable=false)
	public String getEMail() {
		return EMail;
	}

	/**
	 * @category setter
	 * @param eMail
	 */
	public void setEMail(String eMail) {
		EMail = eMail;
	}

	/**
	 * @category getter
	 * @return PW
	 */
	public String getPW() {
		return PW;
	}

	/**
	 * @category setter
	 * @param pW
	 */
	public void setPW(String pW) {
		PW = pW;
	}
}
