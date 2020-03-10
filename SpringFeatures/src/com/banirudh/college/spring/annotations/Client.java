package com.banirudh.college.spring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/banirudh/college/spring/annotations/beans.xml");
		System.out.println("Beans loaded...");
		College collegeObject = context.getBean("collegeBean", College.class);
		System.out.println("College object created: "+collegeObject);
		collegeObject.test();
	}

}
