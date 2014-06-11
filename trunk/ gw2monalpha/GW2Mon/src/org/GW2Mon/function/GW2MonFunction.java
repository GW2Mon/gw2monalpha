package org.GW2Mon.function;

import java.io.File;
import java.io.IOException;

import javax.swing.DefaultListModel;

import org.GW2Mon.GW2Mon;
import org.GW2Mon.pojo.Account;
import org.GW2Mon.pojo.Charakter;
import org.GW2Mon.service.AccountService;
import org.GW2Mon.service.CharacterService;
import org.ini4j.InvalidFileFormatException;
import org.ini4j.Wini;

public class GW2MonFunction {

	private AccountService accService = new AccountService();
	private CharacterService charService = new CharacterService();

	public void WindowClosed() {
		accService.saveAccounts();
		charService.saveCharakters();
	}

	public void WindowOpened(DefaultListModel<String> Accounts,
			DefaultListModel<String> Charakters) {
		accService.loadAccounts();
		charService.loadCharakters();
		for (Account acc : accService.loadAccounts()) {
			Accounts.addElement(acc.getName());
		}
		for (Charakter Char : charService.loadCharakters()) {
			Charakters.addElement(Char.getName());
		}
	}

	public Account lAccountClicked(DefaultListModel<String> lAccounts) {
		Account acc = null;

		return acc;
	}

	public Charakter lCharakterClicked(DefaultListModel<String> lCharakter) {
		Charakter Char = null;

		return Char;
	}

	public void iniLoad() {
		Wini ini=null;
		try {
			File file = new File(System.getProperty("user.dir")
					+ "/src/GW2Mon.ini");

			if (file.exists() && file.canRead()) {
				ini = new Wini(file);
				GW2Mon.lang = System.getProperty("user.dir")
						+ ini.get("config", "Language");

				GW2Mon.CoreCfg = System.getProperty("user.dir")
						+ ini.get("config", "CoreCfg");

				GW2Mon.AccCfg = (System.getProperty("user.dir") + ini.get("config",
						"AccCfg"));
				GW2Mon.CharCfg = System.getProperty("user.dir")
						+ ini.get("config", "CharCfg");
				GW2Mon.CorePath = System.getProperty("user.dir")
						+ ini.get("Database", "CoreData");
				GW2Mon.AccPath = System.getProperty("user.dir")
						+ ini.get("Database", "Account");
				GW2Mon.CharPath = System.getProperty("user.dir")
						+ ini.get("Database", "Character");
			}
		} catch (InvalidFileFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
