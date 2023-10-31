package org.jsp.jdbc.demo4.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteDemo {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Class is Loaded and Registered ");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/alidb1", "root", "admin");
		System.out.println("Successfully connected to data base ");
		
		
		// it will delete the particular row
		PreparedStatement ps=con.prepareStatement("delete from emp_db where phone=?"); // delete from table_name where column_name=?
		ps.setString(1, "8217066785"); 
		
		int i=ps.executeUpdate();
		if(i>0) {
			System.out.println("deleted the row ");
		}
		else {
			System.out.println("not deleted");
		}
		
	}

}
