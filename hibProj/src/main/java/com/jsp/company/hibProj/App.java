package com.jsp.company.hibProj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	private static SessionFactory sessionFactory;

	public static void main(String[] args) {
		try {
			// Initialize SessionFactory once
			Configuration config = new Configuration();
			config.configure();
			sessionFactory = config.buildSessionFactory();

			// Test CRUD operations
//			createUser(3, "Raja Raj", 9079, "rajahnmeury@gmail.com");
			User user = getUserById(6);
			System.out.println(user.getEmail());
//			updateUser(3, "Raja Ram", 9080, "raja.ram@example.com");
//			deleteUser(3);

		} finally {
			if (sessionFactory != null) {
				sessionFactory.close(); // Close factory when done
			}
		}
	}

	// CREATE
	public static void createUser(int id, String name, int phone, String email) {
		try (Session session = sessionFactory.openSession()) {
			Transaction transaction = session.beginTransaction();
			User user = new User(id, name, phone, email);
			session.save(user);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// READ
	public static User getUserById(int id) {
		try (Session session = sessionFactory.openSession()) {
			return session.get(User.class, id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// UPDATE
	public static void updateUser(int id, String newName, int newPhone, String newEmail) {
		try (Session session = sessionFactory.openSession()) {
			Transaction transaction = session.beginTransaction();
			User user = session.get(User.class, id);
			if (user != null) {
				user.setName(newName);
				user.setPhone(newPhone);
				user.setEmail(newEmail);
				session.update(user); // Alternatively, Hibernate auto-detects changes
			}
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// DELETE
	public static void deleteUser(int id) {
		try (Session session = sessionFactory.openSession()) {
			Transaction transaction = session.beginTransaction();
			User user = session.get(User.class, id);
			if (user != null) {
				session.delete(user);
			}
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}