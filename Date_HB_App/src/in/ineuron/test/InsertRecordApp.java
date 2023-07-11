package in.ineuron.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.model.PersonInfo;
import in.ineuron.util.HibernateUtils;

public class InsertRecordApp {
	public static void main(String[] args) {

		Session session = null;
		Transaction transaction = null;
		Boolean flag = false;
		Integer id = null;

		try {
			session = HibernateUtils.getSession();
			if (session != null) {
				transaction = session.beginTransaction();
			}
			if (transaction != null) {
				PersonInfo pi = new PersonInfo();
//				pi.setPid(101);
				pi.setPname("teja");
				pi.setDob(LocalDate.of(1997, 8, 15));
				pi.setDom(LocalDateTime.of(2025, 9, 11, 9, 20));
				pi.setDoj(LocalTime.of(6, 50));

				id = (Integer) session.save(pi);

				flag = true;

			}
		} catch (HibernateException he) {
			he.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				transaction.commit();
				System.out.println("Object saved in database"+id);
			} else {

				System.out.println("Object not saved in database");

			}
			HibernateUtils.closeSession(session);
			HibernateUtils.closeSessionFactory();

		}
	}
}
