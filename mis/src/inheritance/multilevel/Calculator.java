package inheritance.multilevel;

public class Calculator {
	int val1, val2;
	int result;
	
	
	public Calculator(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}

	public void summation() {
		result = val1 + val2;
	}

	@Override
	public String toString() {
		return "Calculator [val1=" + val1 + ", val2=" + val2 + ", result=" + result + "]";
	}
}
