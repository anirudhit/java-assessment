/**
 * Program to add two matrices.
 */
package arrays.multidimension;

import java.util.Scanner;

public class AddMatrices {

	public static void main(String[] args) {
		int rowSize;
		int colSize;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter row size: ");
		rowSize = scanner.nextInt();
		System.out.print("Enter column size: ");
		colSize = scanner.nextInt();
		int a[][] = new int[rowSize][colSize];
		int b[][] = new int[rowSize][colSize];
		int c[][] = new int[rowSize][colSize];
		
		
		initMatrix(a, "A", rowSize, colSize, scanner);
		initMatrix(b, "B", rowSize, colSize, scanner);
		
		printMatrix(a, "Matrix A", rowSize, colSize);
		printMatrix(b, "Matrix B", rowSize, colSize);
		
		matrixAddition(a,b,c,rowSize,colSize);
		printMatrix(c, "Sum of matrix A and B", rowSize, colSize);
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
	
	public static void matrixAddition(int matA[][],int matB[][], int matC[][], int rowSize, int colSize) {
		for(int i=0; i<rowSize; i++) {
			for(int j=0; j<colSize; j++) {
				matC[i][j] = matA[i][j] + matB[i][j];
			}
			System.out.print("\n");
		}
	}

}
