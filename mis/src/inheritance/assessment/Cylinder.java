package inheritance.assessment;

public class Cylinder extends Circle {
	double height;
	
	public Cylinder() {}
	
	public Cylinder(double height) {
		this.height = height;
	}
	
	public Cylinder(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}
	
	public Cylinder(double height, double radius, String color) {
		this.height = height;
		this.radius = radius;
		this.color = color;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return Math.PI*radius*radius*height;
	}

	@Override
	public String toString() {
		return "Cylinder [height=" + height + ", getHeight()=" + getHeight() + ", getVolume()=" + getVolume() + "]";
	}
	
}
