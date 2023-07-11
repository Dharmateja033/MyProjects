package in.ineuron.hibernate;

import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.demo.BankAccount;
import in.ineuron.demo.MobileCustomer;

import in.ineuron.util.HibernateUtils;

public class SelectRecordApp {
	public static void main(String[] args) {

		Session session = null;
		Integer id = 1;
		Boolean flag = false;
		Transaction transaction = null;
//		MobileCustomer customer=null;
		BankAccount bk = null;

		try {
			session = HibernateUtils.getSession();
			bk = session.get(BankAccount.class, id);
			bk = session.get(BankAccount.class, id);
			if (bk != null) {
//				 customer = session.get(MobileCustomer.class, id);

				transaction = session.beginTransaction();
				bk.setType("Joint");
//					session.update(bk);
				flag = true;
			}

			else {
				System.out.println("No record");
				System.exit(0);
			}
		} catch (HibernateException he) {
			he.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				transaction.commit();
				System.out.println("obj updated");
				System.out.println("Account opening date :" + bk.getCreatedTime());
				System.out.println("Avnt last modified :" + bk.getUpdatedTime());
				System.out.println("Version count ;" + bk.getVersionCount());
				System.out.println("After updation :" + bk);
			} else
				System.out.println("obj not updated");
			HibernateUtils.closeSession(session);
			HibernateUtils.closeSessionFactory();

		}
	}
}
