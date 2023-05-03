package TUTORIAL2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url ="jdbc:mysql://localhost:3306/employee";
		String username="root";
		String password="123456789";
		
		Connection con =DriverManager.getConnection(url, username, password);
		
		Statement stm =con.createStatement();
		
		ResultSet rs =stm.executeQuery("select * from emp where id=2");
		
		int cols= rs.getMetaData().getColumnCount();
		
		rs.next();
		
		for(int i=1;i<=cols;i++)
		{
			System.out.println(rs.getString(i));
		}
		
	}

}
