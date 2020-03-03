package com.jdbc.myapp.servlet;

import java.sql.SQLException;

import com.jdbc.myapp.Beans.User;
import com.jdbc.myapp.Modals.UserData;

public class DriverClass {
	public static void main(String[] args) throws SQLException {
		
		User user = new User();
		user.setId(1);
		user.setName("John");
		user.setEmail("abc@gmail.com");
		user.setPhone("999999999");
		
		UserData userData = new UserData();
		int result = userData.InsertData(user);
		
		System.out.println(result);
		
	}
}
