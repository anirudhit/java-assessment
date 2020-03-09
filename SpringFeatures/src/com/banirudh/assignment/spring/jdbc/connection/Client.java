package com.banirudh.assignment.spring.jdbc.connection;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/banirudh/assignment/spring/jdbc/connection/beans.xml");
		JDBCConnection con = context.getBean("jdbcConnectionObject", JDBCConnection.class);
		con.display();
		con.getJDBCConnection();
	}

}
