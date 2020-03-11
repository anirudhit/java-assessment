package com.banirudh.card.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banirudh.card.rest.component.User;
import com.banirudh.card.rest.repository.UserDao;

@Service
public class UserServ {
	@Autowired
	private UserDao userDao;
	
	public List<User> getAllUsers(){
		return userDao.getAllUsers();
	}
	
	public User getUserById(int userId){
		return userDao.getUserById(userId);
	}
	
	public User saveUser(User user){
		return userDao.saveUser(user);
	}
}
