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

import com.banirudh.card.rest.component.Account;
import com.banirudh.card.rest.service.AccountService;

@RestController
public class AccountCtrl {
	
	@Autowired
	AccountService accountService;
	
	@RequestMapping(value="/getAccountsCount", method=RequestMethod.GET, headers="Accept=application/json")
    public ResponseEntity<Account>  getAccountsCount() {
        Account accountCount = accountService.getAccountsCount();
        return new ResponseEntity<Account>(accountCount,HttpStatus.OK);
    }
	
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
	
	@RequestMapping(value="/addAccount", method=RequestMethod.POST, headers="Accept=application/json")
	public ResponseEntity<Account> addAccount(@RequestBody Account accountRequest){
		Account account = accountService.addAccount(accountRequest);
		return new ResponseEntity<Account>(account, HttpStatus.OK);
	}
	
	@RequestMapping(value="/updateAccount", method=RequestMethod.POST, headers="Accept=application/json")
	public ResponseEntity<Account> updateAccount(@RequestBody Account accountRequest){
		Account account = accountService.updateAccount(accountRequest);
		return new ResponseEntity<Account>(account,HttpStatus.OK);
	}
	
	@RequestMapping(value="/deleteAccount", method=RequestMethod.POST, headers="Accept=application/json")
	public void deleteAccount(@RequestBody Account accountRequest) {
		accountService.deleteAccount(accountRequest);
	}
	
}
