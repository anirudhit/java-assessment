package inheritance.hybrid;

public class AreaOfRectangle extends Calculator {
	public AreaOfRectangle(float length, float breadth) {
		super(length, breadth);
	}
	
	public void calcAreaofRectangle() {
		area = length * breadth;
	}
}
