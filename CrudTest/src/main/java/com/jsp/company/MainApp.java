package com.jsp.company;

 import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
	public static void main(String[] args) {
		// Configure Hibernate and build SessionFactory
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml"); // Reads configuration from hibernate.cfg.xml

		// Set properties for logging SQL queries to the console
		configuration.setProperty("hibernate.show_sql", "true"); // Enable SQL logging
		configuration.setProperty("hibernate.format_sql", "true"); // Format the SQL for readability

		// Build SessionFactory
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// Open a session
		Session session = sessionFactory.openSession();

		// Begin a transaction
		Transaction transaction = session.beginTransaction();

		// Create an Employee object (if you were saving data)
		Employee employee = new Employee();
		employee.setName("John Doe");
		employee.setSalary(50000);

		// Save Employee object (if data is being saved)
		session.save(employee);

		// Commit the transaction (if saving data)
		transaction.commit();

		// Close the session
		session.close();

		System.out.println("Hibernate session opened successfully!");
	}
}
