package org.GW2Mon.dao;

import java.util.ArrayList;

import org.GW2Mon.function.DB;
import org.GW2Mon.pojo.CraftingDiscipline;
import org.GW2Mon.pojo.Craftingdiscipline_has_Recept;
import org.GW2Mon.pojo.Recipe;
import org.hibernate.Transaction;

public class CraftingDiscipline_has_ReceptDao {

	@SuppressWarnings("unchecked")
	public ArrayList<Craftingdiscipline_has_Recept> getCraftingDiscipline_has_Recepts() {
		ArrayList<Craftingdiscipline_has_Recept> arrayList = null;
		DB db = new DB();
		arrayList = (ArrayList<Craftingdiscipline_has_Recept>) db.session
				.createQuery("from " + Craftingdiscipline_has_Recept.class)
				.list();
		return arrayList;
	}

	public Craftingdiscipline_has_Recept getCraftingDiscipline_has_Recept(
			CraftingDiscipline CD, Recipe Rec) {
		Craftingdiscipline_has_Recept CD_has_Recept = null;
		DB db = new DB();
		db.session.createQuery("from " + Craftingdiscipline_has_Recept.class
				+ " where CraftingDiscipline=" + CD.getId() + " and Recept="
				+ Rec.getId());
		return CD_has_Recept;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Craftingdiscipline_has_Recept> getCraftingDiscipline_has_Recepts(
			Object Param) {
		ArrayList<Craftingdiscipline_has_Recept> arrayList = null;
		DB db = new DB();
		if (Param.getClass() == CraftingDiscipline.class)
			arrayList = (ArrayList<Craftingdiscipline_has_Recept>) db.session
					.createQuery(
							"from " + Craftingdiscipline_has_Recept.class
									+ " where CraftingDiscipline="
									+ ((CraftingDiscipline) Param).getId())
					.list();
		else if (Param.getClass() == Recipe.class)
			arrayList = (ArrayList<Craftingdiscipline_has_Recept>) db.session
					.createQuery(
							"from " + Craftingdiscipline_has_Recept.class
									+ " where Recept="
									+ ((Recipe) Param).getId()).list();
		return arrayList;
	}

	public void setCraftingDiscipline_has_Recepts(
			ArrayList<Craftingdiscipline_has_Recept> arrayList) {
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			for (Craftingdiscipline_has_Recept CD_has_Recept : arrayList)
				db.session.saveOrUpdate(CD_has_Recept);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}

	public void setCraftingDiscipline_has_Recept(
			Craftingdiscipline_has_Recept CD_has_Recept) {
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			db.session.saveOrUpdate(CD_has_Recept);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}

	public void setCraftingDiscipline_has_Recept(CraftingDiscipline CD,
			Recipe Rec) {
		DB db = new DB();
		Transaction trans = db.session.beginTransaction();
		try {
			db.session.saveOrUpdate(getCraftingDiscipline_has_Recept(CD, Rec));
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
}
