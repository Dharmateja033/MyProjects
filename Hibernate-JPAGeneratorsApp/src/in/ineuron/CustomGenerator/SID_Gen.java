package in.ineuron.CustomGenerator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class SID_Gen implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor si, Object arg1) throws HibernateException {

		String date=new SimpleDateFormat("yyyy-mm-dd").format(new Date());
		int num=new Random().nextInt(1000);
		String p1="STD_";
		String p2="ID_";
		return p1+date+p2+num;
		
		
//		String id = " ";
//		Connection connection = null;
//		Statement statement = null;
//		ResultSet resultSet = null;
//		String date=new SimpleDateFormat("yyyy-mm-dd").format(new Date());
//		try {
//			connection = si.connection();
//			statement = connection.createStatement();
//			resultSet = statement.executeQuery("select sid_seq.nextval from student");
//			while (resultSet.next()) {
//				int i = resultSet.getInt(1);
//
//				if (i <= 9)
//					id = "std_00" + i;
//				else if (i > 9 && i <= 99)
//					id = "std_0" + i;
//				else
//					id = "std_0" + i;
//
//			}
//			return id;
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} 
//		return id;
	}

}
