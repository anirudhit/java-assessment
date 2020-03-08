package com.banirudh.sim.tightcoupling;

public class Airtel implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling from Airtel Sim.");
	}

	@Override
	public void data() {
		System.out.println("Data from Airtel Sim.");
	}

}