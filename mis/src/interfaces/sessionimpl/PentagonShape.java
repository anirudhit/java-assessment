package interfaces.sessionimpl;

public class PentagonShape implements ShapeInterface {

	@Override
	public void shapeSides() {
		System.out.println("Pentagon has 5 sides.");
		System.out.println("Side of the pentagon : "+ shapeSide);
	}
}
