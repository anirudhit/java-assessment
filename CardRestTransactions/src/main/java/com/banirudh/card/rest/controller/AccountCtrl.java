package com.banirudh.card.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.banirudh.card.rest.component.Account;
import com.banirudh.card.rest.service.AccountService;

@RestController
public class AccountCtrl {
	
	@Autowired
	AccountService accountService;
	
	@RequestMapping(value="/getAccounts", method=RequestMethod.GET, headers="Accept=application/json")
    public ResponseEntity<List<Account>>  getAccounts() {
        List<Account> accounts = accountService.getAllAccounts();
        return new ResponseEntity<List<Account>>(accounts,HttpStatus.OK);
    }
	
	@RequestMapping(value="/getAccount/{id}", method=RequestMethod.GET, headers="Accept=application/json")
	public ResponseEntity<Account> getAccount(@PathVariable("id") String id){
		Account account = accountService.getAccount(Integer.parseInt(id));
		if(account == null) {
        	return new ResponseEntity<Account>(account,HttpStatus.CONFLICT);
        }else {
        	return new ResponseEntity<Account>(account,HttpStatus.OK);
        }
	}
}
