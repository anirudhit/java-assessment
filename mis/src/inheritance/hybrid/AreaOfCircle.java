package inheritance.hybrid;

public class AreaOfCircle extends Calculator {
	public AreaOfCircle(float radius) {
		super(radius);
	}
	
	public void calcAreaOfCircle() {
		area = 3.14f * radius * radius;
	}
}
