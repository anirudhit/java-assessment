package com.banirudh.card.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.banirudh.card.rest.component.Account;
import com.banirudh.card.rest.repository.AccountDao;

@Service
public class AccountService {
	
	@Autowired
	AccountDao accountDao;
	
	@Transactional
	public List<Account> getAllAccounts(){
		return accountDao.getAllAccounts();
	}
	
	@Transactional
	public Account getAccount(int id){
		return accountDao.getAccount(id);
	}
	
	@Transactional
	public Account addAccount(Account account) {
		return accountDao.addAccount(account);
	}
	
	@Transactional
	public Account updateAccount(Account account) {
		return accountDao.updateAccount(account);
	}
	
	@Transactional
	public void deleteAccount(Account account) {
		accountDao.deleteAccount(account);
	}
}
