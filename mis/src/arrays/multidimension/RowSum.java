/**
 * Program to find sum of each row of a matrix.
 */
package arrays.multidimension;

import java.util.Scanner;

public class RowSum {

	public static void main(String[] args) {
		int rowSize,colSize;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		rowSize = scanner.nextInt();
		System.out.print("Enter number of colums: ");
		colSize = scanner.nextInt();
		int matA[][] = new int[rowSize][colSize];
		
		initMatrix(matA,"A", rowSize, colSize, scanner);
		printMatrix(matA, "Martix A:", rowSize, colSize);
		rowSum(matA,rowSize,colSize);
		
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
	
	public static void rowSum(int matA[][],int rowSize, int colSize) {
		int rowSum;
		for(int i=0;i<rowSize;i++) {
			rowSum = 0;
			for(int j=0;j<colSize;j++) {
				rowSum += matA[i][j]; 
			}
			System.out.println("Sum of row["+i+"]: "+rowSum);
		}
	}

}
