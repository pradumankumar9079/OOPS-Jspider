package comm.tut.HibernateCrudOperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import comm.tut.entities.User;

public class App {
	public static void main(String[] args) {
//		User user1 = new User();
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sef = cfg.buildSessionFactory();
		Session ses = sef.openSession();
		Transaction trans = ses.beginTransaction();

		try {
//			ses.save(user1);
//			trans.commit();
		} catch (Exception e) {
//			trans.rollback();
//			e.printStackTrace();
		}
	}
}
