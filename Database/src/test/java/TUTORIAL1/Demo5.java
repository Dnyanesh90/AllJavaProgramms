package TUTORIAL1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo5 {

	public static void main(String[] args) throws Exception {
         Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/employee";
		String username="root";
		String password="123456789";
		
		Connection con=DriverManager.getConnection(url, username, password);

		String query = "insert into emp values (?,?,?,?,?,?,?)";

		PreparedStatement stm = con.prepareStatement(query);

		stm.setLong(1, 4);
		stm.setString(2, "abc@123");
		stm.setString(3, "Mayur");
		stm.setString(4, "Abc");
		stm.setString(5, "xyz");
		stm.setString(6, "abc@123");
		stm.setString(7, "mayur@cg.com");
		
		//stm.executeUpdate();
		
		Statement stmt=con.createStatement();
		
		String que="select * from emp where id=4";
		
		ResultSet rs =stmt.executeQuery(que);
		
		int cols =rs.getMetaData().getColumnCount();
		
		rs.next();
		
		for(int i=1;i<=cols;i++)
		{
			System.out.println(rs.getString(i));
		}

	}

}
