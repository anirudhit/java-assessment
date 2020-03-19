package com.banirudh.card.rest.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.banirudh.card.rest.component.Account;

@Repository
public class AccountDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private Account accountCount;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	// Get account count
	public Account getAccountsCount() {
		Session session = getSessionFactory().getCurrentSession();
		String hql = "SELECT count(*) AS count FROM Account A";
		Query query = session.createQuery(hql);
		List results = query.list();
		accountCount.setCount(Integer.parseInt(results.get(0).toString()));
		return accountCount;
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
	
	// Add an account
	public Account addAccount(Account account) {
		Session session = getSessionFactory().getCurrentSession();
		session.persist(account);
		return account;
	}
	
	// Update an account
	public Account updateAccount(Account account) {
		Session session = getSessionFactory().getCurrentSession();
		session.update(account);
		return account;
	}
	
	// Delete an account
	public void deleteAccount(Account account) {
		Session session = getSessionFactory().getCurrentSession();
		session.delete(account);
	}
}
