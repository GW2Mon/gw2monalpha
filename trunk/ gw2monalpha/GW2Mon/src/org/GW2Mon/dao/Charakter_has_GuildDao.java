package org.GW2Mon.dao;

import java.util.ArrayList;

import org.GW2Mon.model.DB;
import org.GW2Mon.pojo.Charakter_has_guild;
import org.GW2Mon.pojo.Charakter;
import org.GW2Mon.pojo.Guild;
import org.hibernate.Transaction;

public class Charakter_has_GuildDao {

	public Charakter_has_guild getCharakter_has_guild(){
		Charakter_has_guild Char_has_guild=null;
		return Char_has_guild;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Charakter_has_guild> getCharakter_has_guilds(){
		ArrayList<Charakter_has_guild> arrayList=null;
		DB db = new DB("Charakter");
		arrayList=(ArrayList<Charakter_has_guild>) db.session.createQuery("from "+Charakter_has_guild.class).list();
		return arrayList;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Charakter_has_guild> getCharakter_has_guilds(Object Param){
		ArrayList<Charakter_has_guild> arrayList=null;
		DB db = new DB("Charakter");
		if (Param.getClass()==Character.class)
			arrayList=(ArrayList<Charakter_has_guild>) db.session.createQuery("from "+Charakter_has_guild.class+"where Charakter="+((Charakter) Param).getId()).list();
		else if(Param.getClass()==Guild.class)
			arrayList=(ArrayList<Charakter_has_guild>) db.session.createQuery("from "+Charakter_has_guild.class+"where Guild="+((Guild) Param).getId()).list();
		return arrayList;
	}
	
	public void setCharakter_has_Guilds(ArrayList<Charakter_has_guild>arrayList){
		DB db = new DB("Charakter");
		Transaction trans = db.session.beginTransaction();
		try {
			for (Charakter_has_guild Char_has_guild : arrayList)
				db.session.saveOrUpdate(Char_has_guild);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
	
	public void setCharakter_has_Guild(Charakter_has_guild Char_has_Guild){
		DB db = new DB("Charakter");
		Transaction trans = db.session.beginTransaction();
		try {
			db.session.saveOrUpdate(Char_has_Guild);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
		}
	}
}
