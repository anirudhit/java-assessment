/* Program with class named CalculateArea with one field Area and 3 methods */
package polymorphism.staticbinding;

import java.util.Scanner;

public class CalculateArea {

	public static void main(String[] args) {
		String area;
		Scanner sc = new Scanner(System.in);
		CalculateArea calcArea = new CalculateArea();
		
		float radius;
		System.out.print("Enter radius of circle: ");
		radius	=	sc.nextFloat();
		area	=	calcArea.calculateAreaofCircle(radius);
		System.out.println(area);
		
		int base, height;
		System.out.print("Enter base of triangle: ");
		base	=	sc.nextInt();
		System.out.print("Enter height of triangle: ");
		height	=	sc.nextInt();
		area	=	calcArea.calculateAreaofTriangle(base,height);
		System.out.println(area);
		
		int side;
		System.out.print("Enter side of square: ");
		side	=	sc.nextInt();
		area	=	calcArea.calculateAreaofSquare(side);
		System.out.println(area);
		sc.close();
	}
	
	public String calculateAreaofCircle(float radius) {
		float areaOfCircle		=	3.145f*radius*radius;
		return "Area of circle : "+areaOfCircle;
	}
	
	public String calculateAreaofTriangle(int  base,int height) {
		float areaOfTriangle	=	(base*height)/2;
		return "Area of triangle : "+areaOfTriangle;
	}
	
	public String calculateAreaofSquare(int  side) {
		float areaOfSquare		=	side*side;
		return "Area of square : "+areaOfSquare;
	}


}
