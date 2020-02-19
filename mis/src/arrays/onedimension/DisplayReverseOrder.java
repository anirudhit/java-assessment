/**
 * Program to read n number of values in an array and display it in reverse order.
 */

package arrays.onedimension;

import java.util.Scanner;

public class DisplayReverseOrder {

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
		
		System.out.println("Reverse order: ");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		
		scanner.close();
	}

}
