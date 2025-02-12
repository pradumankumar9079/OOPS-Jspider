package com.jsp.company.MavenProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");

		SessionFactory sef = con.buildSessionFactory();
		Session ses = sef.openSession();
		System.out.println(sef);
		ses.close();
		sef.close();
	}
}
