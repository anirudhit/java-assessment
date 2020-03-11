package com.banirudh.card.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.banirudh.card.rest.component.User;
import com.banirudh.card.rest.service.UserServ;

@RestController
public class UserCtrl {
	
	@Autowired
	private UserServ userService;
	
	@RequestMapping(value="/getUsers", method=RequestMethod.GET, headers="Accept=application/json")
    public ResponseEntity<List<User>>  getUsers() {
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<List<User>>(users,HttpStatus.OK);
    }
	
	@RequestMapping(value="/getUsersList", method=RequestMethod.GET, headers="Accept=application/json")
    public List<User>  getUsersList() {
        List<User> users = userService.getAllUsers();
        return users;
    }
	
	@RequestMapping(value="/getUser/{userId}", method=RequestMethod.GET, headers="Accept=application/json")
    public ResponseEntity<User> getUserById(@PathVariable("userId") String userId) {
        User user = userService.getUserById(Integer.parseInt(userId));
        if(user == null) {
        	return new ResponseEntity(HttpStatus.CONFLICT);
        }else {
        	return new ResponseEntity<User>(user,HttpStatus.OK);
        }
    }
	
	@RequestMapping(value="/createUser", method=RequestMethod.POST, headers="Accept=application/json")
    public ResponseEntity<User> saveUser(@RequestBody User userResponse) {
		User user = userService.saveUser(userResponse);
		return new ResponseEntity<User>(user, HttpStatus.OK);
    }
	
}
