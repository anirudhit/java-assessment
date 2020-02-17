package interfaces.sessionimpl;

public class PentagonShape implements ShapeInterface {

	@Override
	public void shapeSides() {
		System.out.println("Pentagon has 5 sides.");
		System.out.println("Side of the pentagon : "+ shapeSide);
	}
	
	public strictfp void area() {
		double pentagonConstant = (Math.sqrt(5*(5+2*Math.sqrt(5))))/4;
		double area = pentagonConstant * shapeSide * shapeSide;
		System.out.println("Pentagon area for side "+ shapeSide + " is "+ area);
	}
}
