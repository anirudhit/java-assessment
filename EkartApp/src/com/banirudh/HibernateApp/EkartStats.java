package com.banirudh.HibernateApp;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EkartStats {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(EkartStats.class);
	    logger.info("Hello World");
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		String CUSTOMERS_COUNT = "SELECT COUNT(*) FROM customers";
		Query query = session.createQuery(CUSTOMERS_COUNT);
	    
		  for(Iterator it=query.iterate();it.hasNext();)
		  {
		   long row = (Long) it.next();
		   System.out.print("Count: " + row);
		  }
		
		session.getTransaction().commit();
		session.close();
	}

}
