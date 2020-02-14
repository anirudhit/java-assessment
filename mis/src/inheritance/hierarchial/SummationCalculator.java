package inheritance.hierarchial;

public class SummationCalculator extends Calculator {

	public SummationCalculator(int val1, int val2) {
		super(val1, val2);
	}
	
	public void summation() {
		int sum = val1 + val2;
		System.out.println("Sum: "+sum);
	}

}
