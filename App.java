package in.telusko.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
    	AlienName names=new AlienName();
    	names.setFname("Dharma");
    	names.setMname("Teja");
    	names.setLname("Goud");
    	
        Alien alien = new Alien();
        alien.setId(101);
        alien.setName(names);
        alien.setAge(24);

        Configuration configuration = new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
//        alien=(Alien)session.get(Alien.class, 101);
        session.save(alien);
        transaction.commit();

        session.close();
        System.out.println(alien);
        sessionFactory.close();
    }
}
