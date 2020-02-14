package inheritance.hybrid;

public class Calculator {
	int val1, val2, side;
	int result;
	float radius, length, breadth, area;
	
	public Calculator(int side) {
		this.side = side;
	}
	
	public Calculator(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	
	public Calculator(float radius) {
		this.radius = radius;
	}
	
	public Calculator(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void summation() {
		result = val1 + val2;
	}

	@Override
	public String toString() {
		return "Calculator [val1=" + val1 + ", val2=" + val2 + ", result=" + result + ", side ="+ side +
				", radius=" + radius + ", length=" + length + ", breadth="+ breadth + ", area=" + area +"]";
	}
}
