package inheritance.polymorphism;

public class Calculate {

	public static void main(String[] args) {
		
		Circle circle = new Circle(8.5);
		System.out.println(circle);
		
		Cylinder cylinder = new Cylinder(12.2, 7);
		System.out.println(cylinder);
		
	}

}
