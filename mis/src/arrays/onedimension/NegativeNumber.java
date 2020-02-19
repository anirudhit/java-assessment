/**
 * Program to print all negative elements in an array.
 */

package arrays.onedimension;

import java.util.Scanner;

public class NegativeNumber {

	public static void main(String[] args) {
		int arrSize;
		System.out.println("Enter array size:");
		Scanner scanner = new Scanner(System.in);
		arrSize = scanner.nextInt();
		int arr[] = new int[arrSize];
		
		System.out.println("Enter array values:");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("Negative elements: ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < 0) {
				System.out.print(arr[i]+" ");
			}
		}
		scanner.close();
	}

}
