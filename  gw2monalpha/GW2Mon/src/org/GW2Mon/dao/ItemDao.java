/**
 * 
 */
package org.GW2Mon.dao;

import java.util.ArrayList;

import org.GW2Mon.function.DB;
import org.GW2Mon.pojo.Item;

/**
 * @author GW2Mon[at]gmail.com
 * @version 0.0001
 */
public class ItemDao {

	/**
	 * Returns all Items.
	 * 
	 * @return ArrayList< Item>
	 */
	@SuppressWarnings("unchecked")
	public static ArrayList<Item> getItems() {
		ArrayList<Item> arrayList = new ArrayList<Item>();
		DB db = new DB();
		arrayList = (ArrayList<Item>) db.session.createQuery(
				"from" + Item.class).list();
		return arrayList;
	}

	/**
	 * Returns Item with Id param.
	 * 
	 * @param Id
	 * @return Item
	 */
	public static Item getItemById(Object param) {
		Item item = null;
		DB db = new DB();
		if (param.getClass() == Integer.class)
			item = (Item) db.session.get(Item.class, (Integer) param);
		else
			System.out.println("Type of param not supported.");
		return item;
	}

}
