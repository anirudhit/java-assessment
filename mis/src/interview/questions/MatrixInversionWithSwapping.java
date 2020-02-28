/*
 * Matrix inversion
 * Step 1 - Perform transpose
 * Step 2 - Swap the columns
 */
package interview.questions;

import java.util.Scanner;

public class MatrixInversionWithSwapping {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value: ");
		n = sc.nextInt();
		int arr[][] = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("arr["+i+"]["+j+"]: ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		matrixInversion(n,arr);
		sc.close();

	}
	
	public static void matrixInversion(int n,int arr[][]) {
		System.out.println("Matrix: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+ "\t");
			}
			System.out.print("\n");
		}
		
		int temp;
		// Performing matrix transpose
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				temp = arr[i][j];
				arr[i][j] = arr[j][i];;
				arr[j][i] = temp;
			}
		}
		System.out.println("Matrix transpose: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+ "\t");
			}
			System.out.print("\n");
		}
		
		// Performing matrix inversion
		for(int i=0;i<n/2;i++) {
			for(int j=0;j<n;j++) {
				temp = arr[j][i];
				arr[j][i] = arr[j][n-i-1];
				arr[j][n-i-1] = temp;
			}
		}
		System.out.println("Matrix inversion: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+ "\t");
			}
			System.out.print("\n");
		}
		
	}

}
