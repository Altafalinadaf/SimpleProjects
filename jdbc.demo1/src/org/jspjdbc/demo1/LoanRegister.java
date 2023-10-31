package org.jspjdbc.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class LoanRegister {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Classes loaded and registered ");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/alidb1", "root", "admin");
		System.out.println("successfully connected the alidb1 ");
		
		PreparedStatement ps= con.prepareStatement("insert into emp_db values('21','ali2','3-feb-2001','8217066785')");
		
		int i=ps.executeUpdate();
		
		if(i>0) {
			System.out.println("successfully added the value ");
		}
		else {
			System.out.println("Fail");
		}
	}

}
