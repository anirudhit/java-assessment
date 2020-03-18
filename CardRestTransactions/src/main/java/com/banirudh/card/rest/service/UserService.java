package com.banirudh.card.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.banirudh.card.rest.component.User;
import com.banirudh.card.rest.repository.UserDao;

@Service("userService")
public class UserService {
	@Autowired
	private UserDao userDao;
	
	@Transactional
	public User getUsersCount(){
		return userDao.getUsersCount();
	}
	
	@Transactional
	public List<User> getAllUsers(){
		return userDao.getAllUsers();
	}
	
	@Transactional
	public User getUser(int userId){
		return userDao.getUser(userId);
	}
	
	@Transactional
	public User addUser(User user){
		return userDao.addUser(user);
	}
	
	@Transactional
	public User updateUser(User user){
		return userDao.updateUser(user);
	}
	
	@Transactional
	public void deleteUser(User user){
		userDao.deleteUser(user);
	}
}
