package com.banirudh.human.spring.autowired.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/banirudh/human/spring/autowired/xml/beans.xml");
		Human human = context.getBean("human", Human.class);
		human.startPumping();
	}

}
