package jdbc.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConnection {
	static Connection con;
	static {
		try {
			// Check for the driver jar file
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Create connection with schema
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anirudh","root","********");
			System.out.println("Connection is successful...");
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void fetchEmployees() {
		try {
			// Sql statements
			Statement stmt = con.createStatement();
			// Query
			String query = "SELECT * FROM employee";
			ResultSet res = stmt.executeQuery(query);
			
			while(res.next()) {
				String empid = res.getString("empid");
				String empname = res.getString("empname");
				String salary = res.getString("salary");
				System.out.println(empid+ " "+ empname+ " " + salary);		
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void insertEmployee() {
		try{
			String query = "INSERT INTO employee VALUES(?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, "101");
			ps.setString(3, "9000000.677");
			ps.setString(2, "emp name");
			int result=ps.executeUpdate();
			System.out.println(result);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void updateEmployee() {
		try {
			String query = "UPDATE EMPLOYEE SET empname = ?, salary = ? WHERE empid = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, "Amanda");
			ps.setString(2, "9000");
			ps.setString(3, "101");
			int result=ps.executeUpdate();
			System.out.println(result);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void deleteEmployee() {
		try {
			String query = "DELETE FROM employee WHERE empid = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, "101");
			int result=ps.executeUpdate();
			System.out.println(result);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
}
