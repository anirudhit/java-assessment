package inheritance.hybrid;

import inheritance.hybrid.AdvancedCalculator;
import inheritance.hybrid.ExtendedCalculator;

public class AdvancedCalculator extends ExtendedCalculator {

	public AdvancedCalculator(int val1, int val2) {
		super(val1, val2);
	}
	
	public void divide() {
		result = val1/val2;
	}

}