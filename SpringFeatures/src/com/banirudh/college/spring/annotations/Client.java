package com.banirudh.college.spring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		System.out.println("Beans loaded...");
		College collegeObject = context.getBean("collegeObject", College.class);
		System.out.println("College object created: "+collegeObject);
		collegeObject.test();
	}

}
