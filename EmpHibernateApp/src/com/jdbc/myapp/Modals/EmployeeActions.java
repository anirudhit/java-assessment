package com.jdbc.myapp.Modals;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jdbc.myapp.Beans.Employee;

public class EmployeeActions {
	public int saveEmployee(Employee emp) {
		int result = 0;
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.save(emp);
			session.getTransaction().commit();
			result = 1;
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			session.close();
		}
		return result;
	}
}
