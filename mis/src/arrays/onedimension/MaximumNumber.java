/**
 * Program to find maximum number in array.
 */
package arrays.onedimension;

import java.util.Scanner;

public class MaximumNumber {

	public static void main(String[] args) {
		int arrSize;
		int maxNumber = 0;
		System.out.print("Enter array size: ");
		Scanner scanner = new Scanner(System.in);
		arrSize = scanner.nextInt();
		int arr[] = new int[arrSize];
		
		System.out.println("Enter array values:");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			if(maxNumber == 0 && arr[i] < 0) {
				maxNumber = arr[i];
			}
			if(arr[i] > maxNumber) {
				maxNumber = arr[i];
			}
		}
		System.out.print("Maximum number: "+maxNumber);
		
		scanner.close();

	}

}
