package com.spring.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Printing developer object with empId, empName
		Developer developerObject = (Developer)context.getBean("developerObject");
		System.out.println(developerObject);
		
		// Printing developer object with empId, empName
		Developer developerObjectPhno = (Developer)context.getBean("developerObjectPhno");
		System.out.println(developerObjectPhno);
		
		// Printing project object with projectName, projectId
		Project projectObject = (Project)context.getBean("projectObject");
		System.out.println(projectObject);
		
		// Printing project object with skill
		Project projectObjectSkill = (Project)context.getBean("projectObjectSkill");
		System.out.println(projectObjectSkill);
	}
}
