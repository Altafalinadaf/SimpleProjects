package org.jsp.jdbc.demo5.fetch1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FetchSingleValue {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("class loaded and registered successfully");
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/alidb1", "root", "admin");
		System.out.println("successfully connected to the data base");
		
		PreparedStatement ps=con.prepareStatement("select ename from emp_db");
		
		ResultSet rs=ps.executeQuery();
		System.out.println("Emp Names : ");
		while(rs.next()) {
			System.out.println(rs.getString("ename"));
		}
		con.close();
		
		
	}

}
