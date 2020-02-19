package arrays.onedimension;

/**
 * Program to copy the elements one array into another array.
 */
import java.util.Scanner;

public class CopyArrayElements {

	public static void main(String[] args) {
		int arrSize;
		System.out.println("Enter array size:");
		Scanner scanner = new Scanner(System.in);
		arrSize = scanner.nextInt();
		int arr1[] = new int[arrSize];
		int arr2[] = new int[arr1.length];
		
		System.out.println("Enter array values:");
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = scanner.nextInt();
		}
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		System.out.print("Arr1 elements: ");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		
		System.out.print("\nArr2 elements: ");
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		
		arr2[0]++;
		System.out.println("\n\nArr2[0] element incrementing with 1: ");
		System.out.print("Arr1 elements: ");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.print("\nArr2 elements: ");
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		
		scanner.close();

	}

}
