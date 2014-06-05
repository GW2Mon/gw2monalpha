package org.GW2Mon.function;

import javax.swing.DefaultListModel;

import org.GW2Mon.GW2Mon;
import org.GW2Mon.pojo.Account;
import org.GW2Mon.pojo.Charakter;
import org.GW2Mon.service.AccountService;
import org.GW2Mon.service.CharacterService;

public class GW2MonFunction {

	private AccountService accService = new AccountService();
	private CharacterService charService = new CharacterService();
	
	public void WindowClosed(){
		accService.saveAccounts();
		charService.saveCharakters();
	}
	
	public void WindowOpened(DefaultListModel<String> Accounts, DefaultListModel<String> Charakters){
		accService.loadAccounts();
		charService.loadCharakters();
		for (Account acc:accService.loadAccounts()){
			Accounts.addElement(acc.getName());
		}
		for(Charakter Char:charService.loadCharakters()){
			Charakters.addElement(Char.getName());
		}
	}
	
	public Account lAccountClicked(DefaultListModel<String> lAccounts){
		Account acc = null;
		
		return acc;
	}
	
	public Charakter lCharakterClicked(DefaultListModel<String> lCharakter){
		Charakter Char = null;
		
		return Char;
	}
	
}
