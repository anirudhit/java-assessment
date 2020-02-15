package inheritance.polymorphism;

public class Cylinder extends Circle {
	
	double height;
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.radius = radius;
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	@Override
	public double getArea() {
		return (2*Math.PI*radius)*(radius + height);
	}
	
	public double getVolume() {
		return Math.PI*radius*radius*height;
	}

	@Override
	public String toString() {
		return "Cylinder [height=" + height + ", radius=" + radius + ", getHeight()=" + getHeight() + ", getArea()="
				+ getArea() + ", getVolume()=" + getVolume() + "]";
	}
	
}
