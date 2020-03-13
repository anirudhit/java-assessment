package com.banirudh.cards.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import com.banirudh.cards.beans.User;

public class UserDao {
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	// Create user
	public void createUser(User userObj) {
		hibernateTemplate.save(userObj);
	}
	
	// Retrieve user by id
	public void getUserById(int userId) {
		User user = hibernateTemplate.get(User.class, userId);
		System.out.println(user);
	}
	
	// Update user
	public void updateUser(User userObj) {
		hibernateTemplate.update(userObj);
	}
	
	// Delete user
	public void deleteUser(User userObj) {
		hibernateTemplate.delete(userObj);
	}
	
	// Retrieve all users
	public void getAllUsers() {
		List<User> customerList=hibernateTemplate.loadAll(User.class);
		System.out.println(customerList);
	}
}
