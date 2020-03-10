package com.banirudh.cards.driverclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.banirudh.cards.beans.User;
import com.banirudh.cards.dao.UserDao;

public class Driverclass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserDao userDao = context.getBean("userDao",UserDao.class);
		User userObj = context.getBean("user", User.class);
		
		// Creating user
		// userDao.createUser(userObj);
		
		// Retrieving a user by id
		userDao.getUserById(userObj.getUserId());
		
		// Updating user
		// userDao.updateUser(userObj);
		
		// Deleting user
		// userDao.deleteUser(userObj);
		
		// Retrieving all users
		// userDao.getAllUsers();
	}
}
