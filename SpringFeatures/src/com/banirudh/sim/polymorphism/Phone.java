package com.banirudh.sim.polymorphism;

public class Phone {

	public static void main(String[] args) {
		Sim airtel = new Airtel();
		Sim vodafone = new Vodafone();
		
		// Calling Airtel Methods
		airtel.calling();
		airtel.data();
		
		// Calling Vodafone Methods
		vodafone.calling();
		vodafone.data();
		
	}

}