package abstractclass.impl;

public class Car extends Vehicle {
	@Override
	String getNumberOfTyres() {
		noOfTyres = 5;
		String message = "The car has " + noOfTyres + " tyres"; 
		return message;
	}

}
