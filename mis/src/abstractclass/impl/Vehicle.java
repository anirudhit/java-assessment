package abstractclass.impl;

abstract public class Vehicle {
	int noOfTyres;
	abstract String getNumberOfTyres();
	public void setVehicleName(String vehicleName) {
		System.out.println("Vehicle name: "+vehicleName);
	}
}
