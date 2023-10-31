package org.jsp.jdbc.demo;


/*
 * first way  
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;
*/
public class LoadRegisterJDBCClass {
	
  /* 
   * first way 
   * this is the example of tight coupling 
   * if change change the db server then you have to modify the java application
   * because it  will effect on the java appln also 
	public static void main(String[] args) {
		try {
			Driver d=new Driver();
			
			DriverManager.registerDriver(d);
			System.out.println("Driver class loaded and registered ");
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	*/
	
	
	// this is the another way of loading and register the Driver Class 
	// it's the example of loose coupling
	// loose coupling means = if you want to change the db server,
	// then you no need to change the java application 
	public static void main(String[] args) {
		try {
			// we can directly use this Class.forName("Import the package here");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded and registered ");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
