package org.GW2Mon.function;

import java.util.Iterator;

import javax.swing.JTabbedPane;

import org.GW2Mon.model.Coredata;
import org.GW2Mon.pojo.Race;
import org.GW2Mon.service.RaceService;

public class CoredataFunction {

	public void BtnNew(){
		
		if (Coredata.tabbedPane.getSelectedComponent() == Coredata.pRace) {
		}
		if (Coredata.tabbedPane.getSelectedComponent() == Coredata.pProfession) {
		}
		if (Coredata.tabbedPane.getSelectedComponent() == Coredata.pTrait) {
		}
		if (Coredata.tabbedPane.getSelectedComponent() == Coredata.pSkill) {
		}
	}

	public void SiteChanged(JTabbedPane tabbedPane) {
		if (tabbedPane.getSelectedComponent().getName().equals("pRace")){
			RaceService raceService = new RaceService();
			Iterator<Race> races = raceService.loadRaces().iterator();
			while (races.hasNext())
			Coredata.cbRace.addItem(races.next().getNameGer());
		}
	}
	
}
