package com.banirudh.airtel.spring.di.looselycoupling;

public class Hellotunes implements Service {

	@Override
	public void service() {
		System.out.println("Activated hello tunes service.");
	}

}
