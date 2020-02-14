package inheritance.single;

import java.util.Scanner;

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
	
	public void divide() {
		result = val1/val2;
	}
	
	public static void main(String[] args) {
		ExtendedCalculator ec = new ExtendedCalculator(50,20);
		ec.summation();
		System.out.println(ec);
		ec.substract();
		System.out.println(ec);
		ec.multiply();
		System.out.println(ec);
		ec.divide();
		System.out.println(ec);
	}

}
