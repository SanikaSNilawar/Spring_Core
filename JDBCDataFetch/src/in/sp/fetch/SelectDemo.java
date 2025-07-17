package in.sp.fetch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectDemo {
   public static void main(String[]args) throws Exception {
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
	   PreparedStatement ps=con.prepareStatement("Select * from details");
	   ResultSet rs= ps.executeQuery();
	   
	   while(rs.next()) {
		  //  String name1=rs.getString("name");
		  //  System.out.println(name1);
		   System.out.println(rs.getString("name"));
		   System.out.println(rs.getString("email"));
		   System.out.println(rs.getString("password"));
		   System.out.println(rs.getString("city"));
		   System.out.println(rs.getString("gender"));
	   }
	   con.close();
   }
}
