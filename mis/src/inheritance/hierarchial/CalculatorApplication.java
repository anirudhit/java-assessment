package inheritance.hierarchial;

public class CalculatorApplication {

	public static void main(String[] args) {
		
		SummationCalculator sum = new SummationCalculator(20, 10);
		System.out.println(sum);
		sum.summation();
		
		SubtractionCalculator sub = new SubtractionCalculator(20, 10);
		System.out.println(sub);
		sub.subtraction();
		
		MultiplicationCalculator mul = new MultiplicationCalculator(20, 10);
		System.out.println(mul);
		mul.multiplication();
		
		DivisionCalculator div = new DivisionCalculator(20, 10);
		System.out.println(div);
		div.division();
		
	}

}
