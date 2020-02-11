/**
 * Program to accept two matrices and check whether they are equal.
 */
package arrays.multidimension;

import java.util.Scanner;

public class EqualMatrices {

	public static void main(String[] args) {
		int rowSize,colSize;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		rowSize = scanner.nextInt();
		System.out.print("Enter number of colums: ");
		colSize = scanner.nextInt();
		int matA[][] = new int[rowSize][colSize];
		int matB[][] = new int[rowSize][colSize];
		
		initMatrix(matA,"A", rowSize, colSize, scanner);
		initMatrix(matB,"B", rowSize, colSize, scanner);
		
		printMatrix(matA, "Martix A:", rowSize, colSize);
		printMatrix(matB, "Martix B:", rowSize, colSize);
		
		int equalCount = equalMatrices(matA,matB,rowSize,colSize);
		if(equalCount == 0) {
			System.out.println("Matrices are equal");
		}else {
			System.out.println("Matrices are not equal");
		}
		
		scanner.close();

	}
	
	public static void initMatrix(int matA[][],String strMsg,int rowSize, int colSize, Scanner sc) {
		System.out.println("Initialize matrix "+strMsg+":");
		for(int i=0;i<rowSize;i++) {
			for(int j=0;j<colSize;j++) {
				System.out.print(strMsg+"["+i+"]"+"["+j+"]: ");
				matA[i][j]=sc.nextInt();
			}
		}
	}
	
	public static void printMatrix(int matA[][],String strMsg,int rowSize, int colSize) {
		System.out.println(strMsg);
		for(int i=0;i<rowSize;i++) {
			for(int j=0;j<colSize;j++) {
				System.out.print(matA[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	
	public static int equalMatrices(int matA[][], int matB[][], int rowSize, int colSize) {
		int count = 0;
		for(int i=0;i<rowSize;i++) {
			for(int j=0;j<colSize;j++) {
				if(matA[i][j] != matB[i][j]) {
					count++;
				}
			}
		}
		return count;
	}

}
