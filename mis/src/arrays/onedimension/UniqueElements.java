/**
 * Program to display unique elements found in the array 
 */
package arrays.onedimension;

import java.util.Scanner;

public class UniqueElements {

	/**
	 * @param args
	 */
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
		
		System.out.println("Array elements:");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		int count;
		System.out.println("\nUnique elements:");
		for(int i=0; i<arr.length; i++) {
			count =0;
			for(int j=0;j<arr.length;j++) {
				if(i != j) {
					if(arr[i] == arr[j]) {
						count += 1;
					}
				}
			}
			if(count == 0) {
				System.out.print(arr[i]+ " ");
			}
		}

	}

}
