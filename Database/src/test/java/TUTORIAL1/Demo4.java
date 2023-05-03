package TUTORIAL1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo4 {

	public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/employee";
		String username="root";
		String password="123456789";
		
		Connection con=DriverManager.getConnection(url, username, password);
		
		Statement stm =con.createStatement();
		
		String query="update emp set uname='dipali@amdocs.com' where id=3";
		
		//stm.executeUpdate(query);
		
		String que="select * from emp where id=2";
		
		ResultSet rs =stm.executeQuery(que);
		
		int cols=rs.getMetaData().getColumnCount();
		rs.next();
		
		for(int i=1;i<=cols;i++)	
		{
			System.out.println(rs.getString(i));
		}

	}

}
