/**
 * Program to transpose a matrix.
 */
package arrays.multidimension;

import java.util.Scanner;

public class TransposeMatrices {

	public static void main(String[] args) {
		int rowSize;
		int colSize;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter row size: ");
		rowSize = scanner.nextInt();
		System.out.print("Enter column size: ");
		colSize = scanner.nextInt();
		int aMatrix[][]		=	new int[rowSize][colSize];
		int aTranspose[][]	=	new int[colSize][rowSize];
		
		initMatrix(aMatrix, "A", rowSize, colSize, scanner);
		printMatrix(aMatrix, "Matrix A", rowSize, colSize);
		
		transposeMatrix(aMatrix,aTranspose, rowSize,colSize);
		printMatrix(aTranspose, "Matrix A Transpose", colSize, rowSize);
		
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
	
	public static void transposeMatrix(int matA[][],int matAt[][], int rowSize, int colSize) {
		for(int i=0; i<rowSize; i++) {
			for(int j=0; j<colSize; j++) {
				matAt[j][i] = matA[i][j];
			}
		}
	}

}
