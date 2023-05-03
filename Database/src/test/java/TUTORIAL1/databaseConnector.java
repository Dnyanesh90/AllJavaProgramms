package TUTORIAL1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class databaseConnector {

	public static Connection con;
	public static Statement stm;

	public static void getDataFromDatabaseSheet() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/telecom";
			String uname = "root";
			String pass = "123456789";

			con = DriverManager.getConnection(url, uname, pass);

			stm = con.createStatement();

			String query = "select * from alien where aid= (select max(id) from emp);";

			ResultSet rs = stm.executeQuery(query);

			int cols = rs.getMetaData().getColumnCount();
		
			rs.next();
			
			System.out.println("id for latest User is "+rs.getString(1));

			for (int i = 1; i <= cols; i++) {
				System.out.println(rs.getString(i));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stm.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
