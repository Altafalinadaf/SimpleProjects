package org.jsp.jdbc.demo3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class UserInsertValues {
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id of emp id : ");
		int emp_id=sc.nextInt();
		
		System.out.println("Enter the age of emp : ");
		int age=sc.nextInt();
		
		System.out.println("Enter the name of emp : ");
		String ename=sc.next();		

		
		System.out.println("Enter the sal of emp : ");
		int sal=sc.nextInt();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Classes is loaded and registered ");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/alidb2", "root", "admin");
		System.out.println("success fullly connected to the Database ");
		
		PreparedStatement ps=con.prepareStatement("insert into emp2 values('"+emp_id+"','"+age+"','"+ename+"','"+sal+"')");
		
		int isInseted=ps.executeUpdate();
		
		if(isInseted>0) {
			System.out.println("Value is successfully inserted ");
		}
		else {
			System.out.println("Value is not inseted ");
		}
		sc.close();
		
		
		
	}

}
