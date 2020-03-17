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
import com.banirudh.card.rest.service.UserService;

@RestController
public class UserCtrl {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/getUsers", method=RequestMethod.GET, headers="Accept=application/json")
    public ResponseEntity<List<User>>  getUsers() {
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<List<User>>(users,HttpStatus.OK);
    }
	
	@RequestMapping(value="/getUser/{id}", method=RequestMethod.GET, headers="Accept=application/json")
    public ResponseEntity<User> getUserById(@PathVariable("id") String id) {
        User user = userService.getUser(Integer.parseInt(id));
        if(user == null) {
        	return new ResponseEntity<User>(user,HttpStatus.CONFLICT);
        }else {
        	return new ResponseEntity<User>(user,HttpStatus.OK);
        }
    }
	
	@RequestMapping(value="/addUser", method=RequestMethod.POST, headers="Accept=application/json")
    public ResponseEntity<User> addUser(@RequestBody User userRequest) {
		User user = userService.addUser(userRequest);
		return new ResponseEntity<User>(user, HttpStatus.OK);
    }
	
}
