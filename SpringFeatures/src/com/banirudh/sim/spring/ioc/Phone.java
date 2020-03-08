package com.banirudh.sim.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Phone {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/banirudh/sim/spring/ioc/beans.xml");
		Sim sim = context.getBean("sim", Sim.class);
		sim.calling();
		sim.data();
	}

}