package org.GW2Mon.function;

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
	 * standard Constructor loading Core-database with default configuration.
	 */
	public DB() {
		config.configure(GW2Mon.CorePath);
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
				config.getProperties()).build();
		session = factory.getCurrentSession();
	}

	/**
	 * Constructor with parameter [configuration] for <br>
	 * other configuration for SessionFactory <br>
	 * and parameter [db] for other database-location.
	 * 
	 * @param configuration
	 *            : File
	 * @param db
	 *            : File
	 */
	public DB(File configuration, File db) {
		if (db.exists() && db.canWrite()) {
			config.setProperty("hibernate.connection.url",
					"jdbc:sqlite:" + db.getAbsolutePath());
		}
		config.configure(configuration);
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
				config.getProperties()).build();

		factory = config.buildSessionFactory(serviceRegistry);
		session = factory.getCurrentSession();
	}
}
