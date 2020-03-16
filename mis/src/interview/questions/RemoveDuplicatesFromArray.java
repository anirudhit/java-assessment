/*
 * Remove duplicates from an array using sets and streams
 */
package interview.questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int numArr[] = {5,3,7,3,4,2,7,11,23,67,45,32,12,45,34,67,89,56,67,43,23,12,45,67,87,56};
		removeDuplicatesWithSets(numArr);
		removeDuplicatesWithStreams(numArr);
	}
	
	public static void removeDuplicatesWithSets(int numArr[]) {
		Set<Integer> numSet = new HashSet<Integer>();
		for (int i : numArr) {
			numSet.add(i);
		}
		
		System.out.println("Initial Array: ");
		for(int i: numArr) {
			System.out.print(i+" ");
		}
		
		System.out.println("\nArray without duplicates: ");
		for(int i: numSet) {
			System.out.print(i+" ");
		}
		
		System.out.println("\nActual size:"+ numArr.length);
		System.out.println("Without duplicates size:"+numSet.size());
	}
	
	public static void removeDuplicatesWithStreams(int numArr[]) {
		
		int numArrWithoutDuplicates[] = Arrays.stream(numArr).distinct().toArray();
		
		System.out.println("\nInitial Array: ");
		for(int i: numArr) {
			System.out.print(i+" ");
		}
		
		System.out.println("\nArray without duplicates: ");
		for(int i: numArrWithoutDuplicates) {
			System.out.print(i+" ");
		}
		
		System.out.println("\nActual size:"+ numArr.length);
		System.out.println("Without duplicates size:"+numArrWithoutDuplicates.length);
	}

}
