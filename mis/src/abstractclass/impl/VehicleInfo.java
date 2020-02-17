package abstractclass.impl;

public class VehicleInfo {

	public static void main(String[] args) {
		Vehicle v1 = new Car();
		v1.setVehicleName("Car");
		System.out.println(v1.getNumberOfTyres());
		
		Vehicle v2 = new Bus();
		v2.setVehicleName("Bus");
		System.out.println(v2.getNumberOfTyres());
	}

}
