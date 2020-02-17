package interfaces.sessionimpl;

public class SquareShape implements ShapeInterface {

	@Override
	public void shapeSides() {
		System.out.println("Square has 4 sides");
		System.out.println("Side of the square : "+ shapeSide);
	}

}
