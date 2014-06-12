package org.GW2Mon.function;

import java.io.File;
import java.io.IOException;

import javax.swing.DefaultListModel;

import org.GW2Mon.GW2Mon;
import org.GW2Mon.pojo.Account;
import org.GW2Mon.pojo.Charakter;
import org.GW2Mon.service.AccountService;
import org.GW2Mon.service.CharacterService;
import org.apache.log4j.Logger;
import org.ini4j.InvalidFileFormatException;
import org.ini4j.Wini;

public class GW2MonFunction {

	private AccountService accService = new AccountService();
	private CharacterService charService = new CharacterService();
	private static Logger logger = Logger.getLogger(GW2MonFunction.class);

	/**
	 * Operations done by window.Closed
	 */
	public void WindowClosed() {
		accService.saveAccounts();
		charService.saveCharakters();
	}

	/**
	 * Loading Accounts and Characters into DefaultListModels
	 * 
	 * @param Accounts
	 * @param Charakters
	 */
	public void WindowOpened(DefaultListModel<String> lAccounts,
			DefaultListModel<String> lCharakters) {
		accService.loadAccounts();
		charService.loadCharakters();
		for (Account account : accService.loadAccounts()) {
			lAccounts.addElement(account.getName());
			logger.info("Accounts loaded.");
		}
		for (Charakter charakter : charService.loadCharakters()) {
			lCharakters.addElement(charakter.getName());
			logger.info("Charakters loaded.");
		}
	}

	/**
	 * Loading the Account account selected in DefaultListModel lAccounts
	 * 
	 * @param lAccounts
	 *            : DefaultListModel
	 * @return account : Account
	 */
	public Account lAccountClicked(DefaultListModel<String> lAccounts) {
		Account account = null;
		
		return account;
	}

	public Charakter lCharakterClicked(DefaultListModel<String> lCharakter) {
		Charakter Char = null;

		return Char;
	}

	/**
	 * Loading the values from the GW2Mon.ini-File <br>
	 * for hibernate-configurations and database paths. <br>
	 * If paths in Ini false loading default.
	 */
	public void iniLoad() {
		Wini ini = null;
		try {
			File file = new File(System.getProperty("user.dir")
					+ "/src/GW2Mon.ini");

			if (file.exists() && file.canRead()) {
				ini = new Wini(file);
				GW2Mon.lang = System.getProperty("user.dir")
						+ ini.get("config", "Language");

				file = new File(System.getProperty("user.dir")
						+ ini.get("config", "CoreCfg"));

				if (file.exists() && file.canRead())
					GW2Mon.CoreCfg = file;
				else
					GW2Mon.CoreCfg = new File(System.getProperty("user.dir")
							+ "\\src\\hibernate.cfg.xml");

				file = new File(System.getProperty("user.dir")
						+ ini.get("config", "AccCfg"));
				if (file.exists() && file.canRead())
					GW2Mon.AccCfg = file;
				else
					GW2Mon.AccCfg = new File(System.getProperty("user.dir")
							+ "\\src\\Account.cfg.xml");

				file = new File(System.getProperty("user.dir")
						+ ini.get("config", "CharCfg"));
				if (file.exists() && file.canRead())
					GW2Mon.CharCfg = file;
				else
					GW2Mon.CharCfg = new File(System.getProperty("user.dir")
							+ "\\src\\Charakter.cfg.xml");

				file = new File(System.getProperty("user.dir")
						+ ini.get("Database", "CoreData"));
				if (file.exists() && file.canRead() && file.canWrite())
					GW2Mon.CorePath = file;
				else
					GW2Mon.CorePath = new File(System.getProperty("user.dir")
							+ "\\Data\\GW2Mon.db");

				file = new File(System.getProperty("user.dir")
						+ ini.get("Database", "Account"));
				if (file.exists() && file.canRead() && file.canWrite())
					GW2Mon.AccPath = file;
				else
					GW2Mon.AccPath = new File(System.getProperty("user.dir")
							+ "\\Data\\Acc.db");
				
				file=new File(System.getProperty("user.dir")
						+ ini.get("Database", "Character"));
				if (file.exists()&&file.canRead()&&file.canWrite())
				GW2Mon.CharPath = file;
				else
					GW2Mon.CharPath=new File(System.getProperty("user.dir")
						+ "\\Data\\Char.db");
			}
		} catch (InvalidFileFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public void mntmRessourcencalcClicked() {
		// TODO Auto-generated method stub
		
	}

}
