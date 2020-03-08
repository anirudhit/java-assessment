package com.banirudh.airtel.spring.di.looselycoupling;

public class Calling implements Service {

	@Override
	public void service() {
		System.out.println("Activated calling service.");
	}

}
