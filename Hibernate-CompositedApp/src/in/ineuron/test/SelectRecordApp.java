package in.ineuron.test;

import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.model.PgmProjectID;
import in.ineuron.model.PgmProjectInfo;
import in.ineuron.util.HibernateUtils;

public class SelectRecordApp {
	public static void main(String[] args) {

		Session session = null;

		try {
			session = HibernateUtils.getSession();
			if (session != null) {
               PgmProjectID id=new PgmProjectID();
               id.setPid(100);
               id.setProjId(501);
               PgmProjectInfo pf=session.get(PgmProjectInfo.class, id);
               if(pf!=null)
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
