package in.ineuron.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.model.Student;
import in.ineuron.util.HibernateUtils;

public class InsertRecordApp {
	public static void main(String[] args) {

		Session session = null;
		Transaction transaction = null;
		Boolean flag = false;
		String id=null;

		try {
			session = HibernateUtils.getSession();
			if (session != null) {
				transaction = session.beginTransaction();
			}
			if (transaction != null) {
				Student student = new Student();
//				student.setSid(109);
				student.setSname("sas");
				student.setSaddress("nagnag");
				student.setSage(32);
				
				 id=(String)session.save(student);
				flag = true;
				System.out.println("obj saved with the id :"+id);

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
