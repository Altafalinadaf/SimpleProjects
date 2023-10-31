package org.jsp.jdbc.demo5.fetchData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FetchData {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Class is Loaded and Registered");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/alidb1", "root", "admin");
		System.out.println("successfuly connected the database server");
		
		PreparedStatement ps=con.prepareStatement("select *from emp_db");
		System.out.println("succeful");
		
		ResultSet rs=ps.executeQuery();
		System.out.println("Execute the query ");
		int i=1;
		
		// 2 way 
		// 1. way 
//		while(rs.next()) {
//			System.out.println("\n\nemployee "+i+" details : ");
//			int emp_id=rs.getInt("empId");
//			String ename=rs.getString("ename");
//			String dob=rs.getString("dob");
//			String phone=rs.getString("phone");
//			
//			System.out.println("emp id : "+emp_id);
//			System.out.println("emp name : "+ename);
//			System.out.println("emp dob : "+dob);
//			System.out.println("emp phone : "+phone);
//			i++;
//		}
		
		// 2.way 
		while(rs.next()) {
			System.out.println("\n\nEmployee "+i+" details : ");
			System.out.println("emp id : "+rs.getInt("empId"));
			System.out.println("emp name : "+rs.getString("ename"));
			System.out.println("emp dob : "+rs.getString("dob"));
			System.out.println("emp phone : "+rs.getString("phone")); 
			i++;
			
		}
		
		System.out.println("\n\nAll the data is fetched from the table ");
	}

}
