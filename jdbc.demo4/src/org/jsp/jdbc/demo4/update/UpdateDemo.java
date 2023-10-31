package org.jsp.jdbc.demo4.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {
	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Class is successfully loaded and registered ");
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost/alidb1", "root", "admin");
		System.out.println("Succefully connected to the data base ");
		
		PreparedStatement ps=con.prepareStatement("update emp_db set ename=?,phone=? where empid=?");
		System.out.println("ready to update ");
		
		
		ps.setString(1,"ali786");
		ps.setString(2, "7337852364");
		ps.setString(3 , "1");
		
		int count=ps.executeUpdate();
		if(count>0) {
			System.out.println("value is updated ");
			
		}
		else {
			System.out.println("not updated ");
		}
		
	}

}
