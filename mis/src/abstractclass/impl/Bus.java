package abstractclass.impl;

public class Bus extends Vehicle {
	@Override
	String getNumberOfTyres() {
		noOfTyres = 7;
		String message = "The bus has " + noOfTyres + " tyres"; 
		return message;
	}
}
