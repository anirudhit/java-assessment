package com.banirudh.sim.tightcoupling;

public class Phone {

	public static void main(String[] args) {
		Airtel airtel = new Airtel();
		Vodafone vodafone = new Vodafone();
		
		// Calling Airtel Methods
		airtel.calling();
		airtel.data();
		
		// Calling Vodafone Methods
		vodafone.calling();
		vodafone.data();
		
	}

}