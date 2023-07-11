package in.ineuron.hibernate;

import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.demo.BankAccount;

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
//			    MobileCustomer customer = new MobileCustomer();
//			    customer.setCname("jittu");
//			    customer.setMobno(7163598725L);
//			    customer.setCallertune("Snap");
//			    
//			    id=(Integer)session.save(customer);
//			    
				BankAccount bk = new BankAccount();

				bk.setCname("fazil");
				bk.setBalance(20000L);
				bk.setType("current");
				id = (Integer)session.save(bk);

				flag = true;

			}
		} catch (HibernateException he) {
			he.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				transaction.commit();
				System.out.println("Object saved in database " + id);
			} else {
				transaction.rollback();
				System.out.println("Object not saved in database");

			}
			HibernateUtils.closeSession(session);
			HibernateUtils.closeSessionFactory();

		}
	}
}
