package com.banirudh.college.spring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		System.out.println("Beans loaded...");
		College collegeObj = context.getBean("collegeObject", College.class);
		collegeObj.test();
		((AnnotationConfigApplicationContext)context).close();
	}

}
