package interview.questions;

import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value: ");
		n = sc.nextInt();
		
		int arr[][] = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("arr["+i+"]"+"["+j+"] :");
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Values in arr["+n+"]"+"["+n+"] :");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j] +"\t");
			}
			System.out.print("\n");
		}
		
		sc.close();
	}

}
