package JavaCruddb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;





public class JavaCrudoperationdb {
	
	
		public static void main(String[] args) throws SQLException, NumberFormatException, IOException {
			// TODO Auto-generated method stub

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase","root","8722748066");
			
			@SuppressWarnings("unused")
			Statement s = con.createStatement();
			
			System.out.println("Enter the choice:");
			System.out.println("1. Insert 2. delete 3. Update 4. Show Data");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int choice = Integer.parseInt(br.readLine());
			
			try {
			if(choice==1) {
				
				System.out.println("Enter the student id");
				int n = Integer.parseInt(br.readLine());
				System.out.println("Enter the student name");
				String name = br.readLine();
				@SuppressWarnings("unused")
				boolean b =s.execute("insert into students values("+n+ ",'"+name+"')");
				System.out.print("Successfully executed");
			}
			else if(choice == 2) {
				System.out.println("Enter the data to delete");
				System.out.println("Enter the student id");
				int n = Integer.parseInt(br.readLine());
				//System.out.println("Enter the student name");
				//String name = br.readLine();
				boolean b = s.execute("delete from students where studentid= "+n+"");
				System.out.print("Successfully executed");
				
			}else if(choice == 3) {
			
				System.out.println("Enter details to update");
				System.out.println("Enter the student id");
				int n = Integer.parseInt(br.readLine());
				System.out.println("Enter the student name");
				String name1 = br.readLine();
				String query = "update students set studentname1 = ? where studentid = ? ";
				boolean b = s.execute("update students set studentname='"+name1+"' where studentid="+n);
				System.out.print("Successfully executed");
				
			}else if(choice ==4) {
			
				System.out.println("Show all details");
				//String sql = "select * from info";
				boolean b = s.execute("select * from students");
				ResultSet rs = s.executeQuery ("select * from students");
				
		        while (rs.next ())
		        { 
		            System.out.println ("ID:     " + rs.getInt (1));
		            System.out.println ("name:" + rs.getString (2)); 
		        }
		      
				System.out.print("Successfully executed");
			}
				
			
			}catch(Exception e){
				System.out.println(e);
			}
				

			con.close();
		
		}

	}