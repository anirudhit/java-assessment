package inheritance.hierarchial;

public class DivisionCalculator extends Calculator {

	public DivisionCalculator(int val1, int val2) {
		super(val1, val2);
	}
	
	public void division() {
		int sum = val1/val2;
		System.out.println("Division: "+sum);
	}

}
