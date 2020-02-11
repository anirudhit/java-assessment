/**
 * Program to find sum of main diagonal elements of a matrix.
 */
package arrays.multidimension;

import java.util.Scanner;

public class DiagonalElementSum {

	public static void main(String[] args) {
		int rowSize;
		int colSize;
		int diagonalSum;
		Scanner scanner	=	new Scanner(System.in);
		System.out.print("Enter row size: ");
		rowSize 		=	scanner.nextInt();
		System.out.print("Enter column size: ");
		colSize			=	scanner.nextInt();
		int matA[][]	=	new int[rowSize][colSize];
		
		initMatrix(matA, "A", rowSize, colSize, scanner);
		if(rowSize == colSize) {
			printMatrix(matA, "Matrix A", rowSize, colSize);
			diagonalSum = addDiagonalElements(matA, rowSize, colSize);
			System.out.println("Sum of diagonal elements : "+diagonalSum);
		}else {
			System.out.println("Cannot find sum of diagonal elements. Please make sure the rows and columns are equal.");
		}
		scanner.close();
	}
	
	public static void initMatrix(int matrix[][],String matrixMsg, int rowSize, int colSize, Scanner sc) {
		System.out.println("Enter elements for matrix "+ matrixMsg +" : ");
		for(int i=0; i<rowSize; i++) {
			for(int j=0; j<colSize; j++) {
				System.out.print(matrixMsg+"["+i+"]"+"["+j+"] : ");
				matrix[i][j] = sc.nextInt();
			}
		}
	}
	
	public static void printMatrix(int matrix[][],String matrixMsg, int rowSize, int colSize) {
		System.out.println(matrixMsg +" : ");
		for(int i=0; i<rowSize; i++) {
			for(int j=0; j<colSize; j++) {
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.print("\n");
		}
	}
	
	public static int addDiagonalElements(int matA[][], int rowSize, int colSize) {
		int sum = 0;
		for(int i=0; i<rowSize; i++) {
			for(int j=0; j<colSize; j++) {
				if(i == j) {
					sum += matA[i][j];
				}
			}
		}
		return sum;
	}

}
