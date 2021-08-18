package JavaCruddb;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {
	
	
	
	
	
	
public static void main(String[] args)throws Exception {
		
		String url="jdbc:mysql://localhost:3306/genesispro";
		String uid="root";
		String pwd="8722748066";
		//Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uid,pwd);
		System.out.println("updating");
		PreparedStatement p1=con.prepareStatement("UPDATE player SET playername='soudi' WHERE playernumber=81");
		boolean rs=p1.execute();
		con.close();

	}
}
