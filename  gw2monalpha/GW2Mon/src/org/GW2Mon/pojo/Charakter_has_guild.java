package org.GW2Mon.pojo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Charakter_has_guild implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@ManyToOne(targetEntity=Account.class, cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Account account;
	@Id
	@ManyToOne(targetEntity=Charakter.class, cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Charakter charakter;
	@Id
	@ManyToOne(targetEntity=Guild.class, cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Guild guild;

	public Charakter_has_guild(Charakter charakter, Account account, Guild guild) {
		this.charakter = charakter;
		this.account = account;
		this.guild = guild;
	}

	public Charakter getCharakter() {
		return charakter;
	}

	public void setCharakter(Charakter charakter) {
		this.charakter = charakter;
	}

	public Guild getGuild() {
		return guild;
	}

	public void setGuild(Guild guild) {
		this.guild = guild;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
