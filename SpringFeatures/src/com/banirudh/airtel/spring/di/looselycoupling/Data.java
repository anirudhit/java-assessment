package com.banirudh.airtel.spring.di.looselycoupling;

public class Data implements Service {

	@Override
	public void service() {
		System.out.println("Activated data service.");
	}

}
