package com.banirudh.HibernateApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.banirudh.dto.Customer;

public class DriverClass {
	public static void main(String[] args) {
		Customer cust = new Customer();
		
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
		cust = (Customer)session.get(Customer.class,1);
		System.out.println(cust);
		
		session.getTransaction().commit();
		
		// Getting the customer details
		
		
	}
}
