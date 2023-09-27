package in.ineuron.demo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.hibernate.Student;
import in.ineuron.util.HibernateUtils;

public class SaveApp {

	public static void main(String[] args) {

		Session session = null;
		Transaction transaction = null;
		Boolean flag = false;

		try {
			session = HibernateUtils.getSession();
			if (session != null) {
				transaction = session.beginTransaction();
			}
			if (transaction != null) {
				Student student = new Student();
				student.setSid(103);
				student.setSname("pull");
				student.setSaddress("mysore");
				student.setAge(26);
				session.save(student);
				flag = true;

			}
		} catch (HibernateException he) {
			he.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				transaction.commit();
				System.out.println("Object saved in database");
			} else {
				transaction.rollback();
				System.out.println("Object not saved in database");

			}
			HibernateUtils.closeSession(session);
			HibernateUtils.closeSessionFactory();

		}
	}

}
