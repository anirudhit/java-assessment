package com.banirudh.HibernateApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.banirudh.dto.Customers;

public class DriverClass {
	public static void main(String[] args) {
		Customers cust = new Customers();
		
		//cust.setCustomerId(1);
		//cust.setCustomerName("John Dusk");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		// Adding the customer
		//session.save(cust);
		
		// Updating the customer
		//session.saveOrUpdate(cust);
		
		// Deleting the customer
		//session.delete(cust);
		
		// Selecting the customers
		cust = (Customers)session.get(Customers.class,103);
		System.out.println(cust);
		
		session.getTransaction().commit();
		
		// Getting the customer details
		
		
	}
}
