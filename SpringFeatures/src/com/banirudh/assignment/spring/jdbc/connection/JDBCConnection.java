package com.banirudh.assignment.spring.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;

public class JDBCConnection {
	@Value("${database.url}")
	private String url;
	@Value("${database.username}")
	private String username;
	@Value("${database.password}")
	private String password;
	@Value("${database.driver}")
	private String driver;
	
	public void display() {
		System.out.println("url: " + url);
		System.out.println("username: " + username);
		System.out.println("password: " + password);
		System.out.println("driver: " + driver);
	}
	
	public void getJDBCConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection con =  DriverManager.getConnection(url,username,password);
		System.out.println("Connection successful: " + con);
	}
	
}
