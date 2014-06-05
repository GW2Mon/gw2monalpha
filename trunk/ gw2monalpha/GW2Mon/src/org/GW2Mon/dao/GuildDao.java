package org.GW2Mon.dao;

import java.util.ArrayList;

import org.GW2Mon.model.DB;
import org.GW2Mon.pojo.Guild;

public class GuildDao {

	/**
	 * Returns Guild with Id or Name param
	 * corresponding on Type of param.
	 * @param param
	 * @return Guild
	 */
	public Guild getGuild(Object param){
		Guild guild = null;
		DB db = new DB();
		if (param.getClass()==Integer.class)
		guild=(Guild) db.session.get(Guild.class,(Integer) param);
		else if(param.getClass()==String.class)
			guild = (Guild) db.session.createQuery("from"+Guild.class+" where Name='"+param+"'");
		return guild;
	}
	
	/**
	 * Returns all Guilds.
	 * @return ArrayList< Guild>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Guild> getGuilds(){
		ArrayList<Guild> arrayList =null;
		DB db = new DB();
		arrayList=(ArrayList<Guild>) db.session.createQuery("from "+Guild.class).list();
		return arrayList;
	}
	
	/**
	 * Returns all Guilds with Tag tag.
	 * @param Tag
	 * @return ArrayList< Guild>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Guild> getGuildsByTag (String tag){
		ArrayList<Guild> arrayList =null;
		DB db = new DB();
		arrayList = (ArrayList<Guild>) db.session.createQuery("from "+Guild.class+" where Tag='"+tag+"'").list();
		return arrayList;
	}
}
