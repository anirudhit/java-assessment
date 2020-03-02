package com.jdbc.myapp.HibernateApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jdbc.myapp.Beans.Employee;

public class DriverClass {
	public static void main(String[] args) {
		// Create an employee
		// Employee empCreate = new Employee(4,"Deligach Harry","21-06-1985","85000","Bangalore","Java");
		// createEmployee(empCreate);
		
		// Retrieve an employee
		// getEmployee();
		
		// Update an employee
		// Employee empUpdate = new Employee(1,"Ikram Harika","21-06-1998","15000","Bangalore",".net");
		// updateEmployee(empUpdate);
		
		// Delete an employee
		// Employee empDelete = new Employee();
		// empDelete.setEmpId(4);
		// deleteEmployee(empDelete);
	}
	
	public static void createEmployee(Employee emp) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		try {
			System.out.println("createEmployee: "+emp);
			session.beginTransaction();
			session.save(emp);
			session.getTransaction().commit();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			session.close();
		}
	}
	
	public static void getEmployee() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Employee emp = new Employee();
		
		try {
			session.beginTransaction();
			emp = (Employee)session.get(Employee.class,6);
			session.getTransaction().commit();
			System.out.println("getEmployee: "+emp);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			session.close();
		}
	}
	
	public static void updateEmployee(Employee emp) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		try {
			System.out.println("updateEmployee: "+emp);
			session.beginTransaction();
			session.saveOrUpdate(emp);
			session.getTransaction().commit();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			session.close();
		}
	}
	
	public static void deleteEmployee(Employee emp) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		try {
			System.out.println("deleteEmployee: "+emp);
			session.beginTransaction();
			session.delete(emp);
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
