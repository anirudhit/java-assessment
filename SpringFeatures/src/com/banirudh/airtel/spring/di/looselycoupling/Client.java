package com.banirudh.airtel.spring.di.looselycoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/banirudh/airtel/spring/di/looselycoupling/beans.xml");
		Airtel airtel = context.getBean("airtelObject", Airtel.class);
		airtel.activateService();
	}

}
