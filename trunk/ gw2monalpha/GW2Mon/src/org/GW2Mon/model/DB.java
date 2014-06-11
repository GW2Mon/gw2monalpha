package org.GW2Mon.model;

import java.io.File;

import org.GW2Mon.GW2Mon;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * @author GW2Mon[at]gmail.com
 * @version 0.0001
 */
public class DB {

	public Configuration config = new Configuration();
	private StandardServiceRegistry serviceRegistry = null;
	private SessionFactory factory = null;
	public Session session = null;

	/**
	 * standard Constructor
	 */
	public DB() {
		config.configure(new File(GW2Mon.CorePath));
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
				config.getProperties()).build();
		session = factory.getCurrentSession();
	}

	/**
	 * Constructor with String parameter for <br>
	 * other configuration for SessionFactory.
	 * 
	 * @param configuration
	 */
	public DB(String configuration, String db) {
		File file = new File(db);
		if (file.exists() && file.canWrite()) {
			config.setProperty("hibernate.connection.url", "jdbc:sqlite:"+file.getAbsolutePath());
		}
		config.configure(new File(configuration));
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
				config.getProperties()).build();

		factory = config.buildSessionFactory(serviceRegistry);
		session = factory.getCurrentSession();
	}
}
