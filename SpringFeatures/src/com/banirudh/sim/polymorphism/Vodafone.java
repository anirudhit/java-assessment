package com.banirudh.sim.polymorphism;

public class Vodafone implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling from Vodafone Sim.");
	}

	@Override
	public void data() {
		System.out.println("Data from Vodafone Sim.");
	}

}