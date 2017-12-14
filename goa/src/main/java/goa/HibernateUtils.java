package goa;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
	private static SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(Employe.class);
		return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().build());
}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	
}