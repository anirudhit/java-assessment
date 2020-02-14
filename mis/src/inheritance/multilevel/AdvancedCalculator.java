package inheritance.multilevel;

public class AdvancedCalculator extends ExtendedCalculator {

	public AdvancedCalculator(int val1, int val2) {
		super(val1, val2);
	}
	
	public void divide() {
		result = val1/val2;
	}
	
	public static void main(String[] args) {
		AdvancedCalculator ac = new AdvancedCalculator(50,20);
		ac.summation();
		System.out.println(ac);
		ac.substract();
		System.out.println(ac);
		ac.multiply();
		System.out.println(ac);
		ac.divide();
		System.out.println(ac);
	}

}
