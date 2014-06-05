package org.GW2Mon.function;

import org.GW2Mon.service.AccountService;
import org.GW2Mon.service.CharacterService;

public class AccountverwaltungFunction {

	private AccountService accService = new AccountService();
	private CharacterService charService = new CharacterService();
	
	public void Windowclosed(){
		accService.saveAccounts();
		charService.saveCharakters();
	}
	
}
