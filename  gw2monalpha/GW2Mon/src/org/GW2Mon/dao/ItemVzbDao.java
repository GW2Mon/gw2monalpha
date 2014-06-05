package org.GW2Mon.dao;

import java.util.ArrayList;

import org.GW2Mon.model.DB;
import org.GW2Mon.pojo.ItemVzb;

public class ItemVzbDao {

	public ItemVzb getItemVzbById( int Id){
		ItemVzb itemvzb=null;
		DB db = new DB();
		itemvzb=(ItemVzb) db.session.get(ItemVzb.class, Id);
		return itemvzb;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<ItemVzb> getItemVzbs(){
		ArrayList<ItemVzb> arrayList = null;
		DB db = new DB();
		arrayList = (ArrayList<ItemVzb>) db.session.createQuery("from " + ItemVzb.class).list();
		return arrayList;
	}
	
	
	
}
