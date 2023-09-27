package in.ineuron.test;

import org.hibernate.HibernateException;

import org.hibernate.Session;

import in.ineuron.model.PersonInfo;
import in.ineuron.util.HibernateUtils;

public class SelectRecordApp {
	public static void main(String[] args) {

		Session session = null;
		Integer id = 1;

		try {
			session = HibernateUtils.getSession();
			if (session != null) {

				PersonInfo pf = session.get(PersonInfo.class, id);
				if (pf != null)
					System.out.println(pf);
				else
					System.out.println("No record");
			}
		} catch (HibernateException he) {
			he.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtils.closeSession(session);
			HibernateUtils.closeSessionFactory();

		}
	}
}
