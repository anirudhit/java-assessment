package com.banirudh.card.rest.repository;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.banirudh.card.rest.component.User;
@Transactional(readOnly = false)
@Repository
public class UserDao {
	@Autowired
	HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	// Get all user from the database
	public List<User> getAllUsers() {
        List<User> users = getTemplate().loadAll(User.class);
        for(User userObj : users)
            System.out.println(userObj);
        return users;
    }
	
	// Get all user by id from the database
	public User getUserById(int userId) {
        User user = getTemplate().get(User.class, userId);
        return user;
    }
	
	// Save a user
	public User saveUser(User user) {
		getTemplate().persist(user);
		return user;
	}
	

}
