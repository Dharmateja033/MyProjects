package in.ineuron.test;

import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.model.PgmProjectID;
import in.ineuron.model.PgmProjectInfo;
import in.ineuron.util.HibernateUtils;

public class InsertRecordApp {
	public static void main(String[] args) {

		Session session = null;
		Transaction transaction = null;
		Boolean flag = false;
		PgmProjectID id=null;

		try {
			session = HibernateUtils.getSession();
			if (session != null) {
				transaction = session.beginTransaction();
			}
			if (transaction != null) {
				PgmProjectID ppid = new PgmProjectID();
			    ppid.setPid(101);
			    ppid.setProjId(502);
			    
			    PgmProjectInfo pinfo=new PgmProjectInfo();
			    pinfo.setId(ppid);
			    pinfo.setDeptno(10);
			    pinfo.setPname("IPL");
			    pinfo.setProjName("IND");
			    
			    id=(PgmProjectID)session.save(pinfo);
				
				 
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

				System.out.println("Object not saved in database");

			}
			HibernateUtils.closeSession(session);
			HibernateUtils.closeSessionFactory();

		}
	}
}
