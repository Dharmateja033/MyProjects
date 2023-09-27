package in.ineuron.demo;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ineuron.hibernate.Student;
import org.hibernate.Session;
import org.hibernate.Session;
import org.hibernate.Session;

public class TestApp {

	public static void main(String[] args) throws IOException {
		//1.Inform JVM to activate Hibernate
		Configuration config=new Configuration();
		config.configure();
		
		//creating a session factory obj to hold many other objects for Hibernate
		SessionFactory sessionFactory=config.buildSessionFactory();
		
		//Using sessionFactory obj,get only one session obj to perform our persistence operation
		Session session=sessionFactory.openSession();//connection obj,ORM-dialect.L1-cache,TXT management
		
		//Begin the transacxtion as the operation is non select
		Transaction transaction=session.beginTransaction();
		
		//2.create Persistence object
		Student student=new Student();
		student.setSid(102);
		student.setSname("Dharma");
		student.setSaddress("kurnool");
		student.setAge(25);
		
		
		//3.perform Persistence operation using Entity/POJO
		session.save(student);
		
		System.in.read();
		
		//4.Generate the query and send to Database for execution
		transaction.commit();
		System.out.println("Obj saved to database");
	
		session.close();
		sessionFactory.close();
		
		
	}

}
