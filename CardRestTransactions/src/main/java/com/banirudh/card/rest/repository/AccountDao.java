package com.banirudh.card.rest.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.banirudh.card.rest.component.Account;

@Repository
public class AccountDao {
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	// Get all accounts from the database
	public List<Account> getAllAccounts() {
		Session session = getSessionFactory().getCurrentSession();
		List<Account> accounts = session.createQuery("from Account").list();
        return accounts;
    }
	
	// Get an account by id from the database
	public Account getAccount(int id) {
		Session session = getSessionFactory().getCurrentSession();
		Account account = session.get(Account.class, id);
        return account;
    }
}
