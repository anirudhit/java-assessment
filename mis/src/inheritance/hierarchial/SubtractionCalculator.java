package inheritance.hierarchial;

public class SubtractionCalculator extends Calculator {

	public SubtractionCalculator(int val1, int val2) {
		super(val1, val2);
	}
	
	public void subtraction() {
		int sum = val1 - val2;
		System.out.println("Difference: "+sum);
	}

}
