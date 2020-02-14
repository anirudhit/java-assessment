package inheritance.hierarchial;

public class MultiplicationCalculator extends Calculator {

	public MultiplicationCalculator(int val1, int val2) {
		super(val1, val2);
	}
	
	public void multiplication() {
		int sum = val1*val2;
		System.out.println("Multiplication: "+sum);
	}

}
