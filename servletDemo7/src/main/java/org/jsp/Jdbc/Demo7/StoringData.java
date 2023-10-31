package org.jsp.Jdbc.Demo7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StoringData {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("The DriverClass is Loaded and Registered ");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/alidb1", "root", "admin");	
		System.out.println("Connection is Established");
		
		PreparedStatement ps=con.prepareStatement("insert into emp_db values ('7861','alias','17-jul-2002','7483514254')");
		
		int i=ps.executeUpdate();
		if(i>0) {
			System.out.println("Valus are succuessfully inserted ");
		}
		else {
			System.out.println("not inserted");
		}
		
		ps.close();
		con.close();
		
		
			
	}

}
