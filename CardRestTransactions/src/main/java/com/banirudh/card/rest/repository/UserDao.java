package com.banirudh.card.rest.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.banirudh.card.rest.component.User;

@Repository
public class UserDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	// Get all user from the database
	public List<User> getAllUsers() {
		Session session = getSessionFactory().getCurrentSession();
		List<User> users = session.createQuery("from User").list();
        return users;
    }
	
	// Get user by id from the database
	public User getUser(int id) {
		Session session = getSessionFactory().getCurrentSession();
		User user = (User) session.get(User.class, id);
        return user;
    }
	
	// Add a user
	public User addUser(User user) {
		Session session = getSessionFactory().getCurrentSession();
		session.persist(user);
		return user;
	}
	
	// Update a user
	public User updateUser(User user) {
		Session session = getSessionFactory().getCurrentSession();
		session.update(user);
		return user;
	}
	
	// Delete a user
	public void deleteUser(User user) {
		Session session = getSessionFactory().getCurrentSession();
		session.delete(user);
	}
	

}
