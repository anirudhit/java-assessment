package com.banirudh.sim.spring.ioc;

public class Jio implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling from Jio Sim.");
	}

	@Override
	public void data() {
		System.out.println("Data from Jio Sim.");
	}

}