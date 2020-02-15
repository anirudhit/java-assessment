package inheritance.polymorphism;

public class Circle {
	
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getArea()=" + getArea() + ", getRadius()=" + getRadius() + "]";
	}

}
