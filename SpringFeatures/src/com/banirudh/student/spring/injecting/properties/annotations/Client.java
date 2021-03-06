package com.banirudh.student.spring.injecting.properties.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/banirudh/student/spring/injecting/properties/annotations/beans.xml");
		System.out.println("Loading application context ...");
		Student student = context.getBean("student", Student.class);
		student.displayStudentInfo();
	}

}
