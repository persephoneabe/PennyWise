package com.canteloupe.web;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HBSessionFactory {

	private static SessionFactory sf;
	
	public static Session getSession() {
		if(sf == null) {
			sf = new Configuration().configure()
					.setProperty("hibernate.connection.url", System.getenv("dburl"))
					.setProperty("hibernate.connection.username", System.getenv("dbusername"))
					.setProperty("hibernate.connection.password", System.getenv("dbpassword"))
					.buildSessionFactory();
		}
		return sf.getCurrentSession();
	}
}
