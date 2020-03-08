package com.banirudh.human.spring.autowired.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/banirudh/human/spring/autowired/qualifier/beans.xml");
		Human human = context.getBean("humanObj", Human.class);
		human.startPumping();
	}

}
