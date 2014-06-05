package org.GW2Mon.dao;

import java.util.ArrayList;

import org.GW2Mon.model.DB;
import org.GW2Mon.pojo.CraftingDiscipline;
import org.GW2Mon.pojo.ItemVzb2;
import org.hibernate.Transaction;

public class CraftingDiscipline_has_ItemVzb2 {

	@SuppressWarnings("unchecked")
	public ArrayList<CraftingDiscipline_has_ItemVzb2> getCraftingDiscipline_has_ItemVzb2s(){
		ArrayList<CraftingDiscipline_has_ItemVzb2> arrayList = null;
		DB db = new DB();
		arrayList = (ArrayList<CraftingDiscipline_has_ItemVzb2>) db.session.createQuery("from "+CraftingDiscipline_has_ItemVzb2.class).list();
		return arrayList;
	}
	
	public CraftingDiscipline_has_ItemVzb2 getCraftingDiscipline_has_ItemVzb2(CraftingDiscipline CD,ItemVzb2 itemVzb2){
		CraftingDiscipline_has_ItemVzb2 CD_has_ItemVzb2=null;
		DB db = new DB();
		CD_has_ItemVzb2 = (CraftingDiscipline_has_ItemVzb2) db.session.createQuery("from "+CraftingDiscipline_has_ItemVzb2.class+"where CraftingDiscipline="+CD.getId()+" and ItemVzb2="+itemVzb2.getId());
		return CD_has_ItemVzb2;
	}
	
	public void setCraftingDiscipline_has_ItemVzb2(CraftingDiscipline_has_ItemVzb2 CD_has_ItemVzb2){
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			db.session.saveOrUpdate(CD_has_ItemVzb2);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
	
	public void setCraftingDiscipline_has_ItemVzb2s(ArrayList<CraftingDiscipline_has_ItemVzb2> arrayList){
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			for (CraftingDiscipline_has_ItemVzb2 CD_has_ItemVzb2 : arrayList)
				db.session.saveOrUpdate(CD_has_ItemVzb2);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
	
	public void setCraftingDiscipline_has_ItemVzb2(CraftingDiscipline CD,ItemVzb2 itemVzb2){
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			db.session.saveOrUpdate(getCraftingDiscipline_has_ItemVzb2(CD,
					itemVzb2));
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
	
}
