package com.product.HibernateApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.product.dto.Category;
import com.product.dto.Product;

public class DriverClass {
	public static void main(String[] args) {
		
		Category category = new Category();
		category.setCategoryId(11);
		Product product = new Product();
		product.setProductId(14);
		product.setProductname("Iwatch");
		product.setCategory(category);
		product.setPrice(445);
		product.setQuantity(25);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.save(product);
			session.getTransaction().commit();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			session.close();
		}
		
	}
}
