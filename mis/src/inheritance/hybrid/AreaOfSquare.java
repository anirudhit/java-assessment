package inheritance.hybrid;

public class AreaOfSquare extends Calculator {
	
	public AreaOfSquare(int side) {
		super(side);
	}
	
	public void calcAreaOfSquare() {
		area = side * side;
	} 

}
