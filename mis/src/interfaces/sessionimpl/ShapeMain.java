package interfaces.sessionimpl;
public class ShapeMain {
		public static void main(String[] args) {
			ShapeInterface sqs = new SquareShape();
			sqs.shapeSides();
			
			ShapeInterface pgs = new PentagonShape();
			pgs.shapeSides();
			
			PentagonShape pg = new PentagonShape();
			pg.shapeSides();
			pg.area();
			
		}
}
