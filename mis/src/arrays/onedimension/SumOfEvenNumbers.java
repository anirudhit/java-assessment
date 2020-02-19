/**
 * Program to find sum of all even numbers in array.
 */
package arrays.onedimension;

import java.util.Scanner;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		int arrSize;
		int evenNumberSum = 0;
		System.out.println("Enter array size:");
		Scanner scanner = new Scanner(System.in);
		arrSize = scanner.nextInt();
		int arr[] = new int[arrSize];
		
		System.out.println("Enter array values:");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evenNumberSum += arr[i];
			}
		}
		
		System.out.println("Sum of even numbers: "+evenNumberSum);
		scanner.close();
	}

}
