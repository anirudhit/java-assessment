package com.banirudh.student.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/banirudh/student/spring/di/beans.xml");
		System.out.println("Loading application context ...");
		Student student = context.getBean("studentObject", Student.class);
		student.startCheating();
		
		AnotherStudent anotherStudent = context.getBean("anotherStudentObject", AnotherStudent.class);
		anotherStudent.startCheating();
	}

}
