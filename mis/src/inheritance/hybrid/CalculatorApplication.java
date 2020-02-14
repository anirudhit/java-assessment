package inheritance.hybrid;

public class CalculatorApplication {

	public static void main(String[] args) {
		AdvancedCalculator ac = new AdvancedCalculator(50,20);
		ac.summation();
		System.out.println("SUM");
		System.out.println(ac);
		
		ac.substract();
		System.out.println("DIFFERENCE");
		System.out.println(ac);
		
		ac.multiply();
		System.out.println("MULTIPLICATION");
		System.out.println(ac);
		
		ac.divide();
		System.out.println("DIVISION");
		System.out.println(ac);
		
		AreaOfCircle aoc = new AreaOfCircle(7.5f);
		aoc.calcAreaOfCircle();
		System.out.println("AREA OF CIRCLE");
		System.out.println(aoc);
		
		AreaOfSquare aos = new AreaOfSquare(15);
		aos.calcAreaOfSquare();
		System.out.println("AREA OF SQUARE");
		System.out.println(aos);
		
		AreaOfRectangle aor = new AreaOfRectangle(10.25f, 25.15f);
		aor.calcAreaofRectangle();
		System.out.println("AREA OF RECTANGLE");
		System.out.println(aor);
	}
}
