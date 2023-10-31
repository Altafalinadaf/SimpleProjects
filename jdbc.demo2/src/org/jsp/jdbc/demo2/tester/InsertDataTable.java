package org.jsp.jdbc.demo2.tester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class InsertDataTable {
	public static void main(String[] args) {
		// define here and call directly the variable name 
		String name="ali38";
		int id=582;
		String dob="25-feb-2001";
		String mob="9611301135";
		
		
		// 
		String name2="ali77";
		int id2=572;
		String dob2="12-feb-2001";
		String mob2="7676282805";
		try {
			Driver d=new Driver();
			DriverManager.registerDriver(d);
			System.out.println("Succuessfully loaded and registered ");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/alidb1", "root", "admin");
			System.out.println("successfully connected the alidb1 "); 
			
		
			PreparedStatement ps=con.prepareStatement("insert into emp_db values('34' ,'ali3', '2-feb-2001','984587143')");	
			// we can also use this one  
			// it will take fresh copy whenever you run 
			// how much time you will compile and run this program it will take fresh copy 
			// now if you will get error because i used empId as primary key so it should be unique, 
			//so emp_id should'nt be same as previous
			ps=con.prepareStatement("insert into emp_db values('"+id+"' ,'"+name+"','"+dob+"','"+mob+"')");
			
			
			// this is also one way of passing the value
			// whenever you it take fresh copy but your emp_id is PK so it say "Duplicate entry '572' for key 'emp_db.PRIMARY'"
			ps=con.prepareStatement("insert into emp_db values(?,?,?,?)");
			ps.setInt(1, id2);
			ps.setString(2, name2);
			ps.setString(3, dob2);
			ps.setString(4, mob2);
			
			// we can also use this one 
			int i=ps.executeUpdate();
			if(i>0) {
				System.out.println("successfully inserted the values ");
			}
			else {
				System.out.println("fail to insert ");
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
