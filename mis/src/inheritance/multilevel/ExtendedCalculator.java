package inheritance.multilevel;

import inheritance.multilevel.Calculator;
import inheritance.multilevel.ExtendedCalculator;

public class ExtendedCalculator extends Calculator {
	
	public ExtendedCalculator(int val1, int val2) {
		super(val1, val2);
	}

	public void substract() {
		result = val1 - val2;
	}
	
	public void multiply() {
		result = val1*val2;
	}

}
