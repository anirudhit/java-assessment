/*
 * Find duplicates in an array without extra space, o(n) run time
 * Given array of integers 1<=a[i]<=n
 * Input = [4,3,2,7,8,2,3,1]
 * Output = [2,3]
 */
package interview.questions;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesInArray {
	public static void main(String[] args) {
		int arr[] = {4,3,2,7,8,2,3,1};
		List<Integer> duplicates = duplicatesInArray(arr);
		System.out.println(duplicates);
	}
	
	public static List<Integer> duplicatesInArray(int arr[]){
		List<Integer> duplicates = new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++) {
			int index = Math.abs(arr[i])-1;
			if(arr[index] < 0) {
				duplicates.add(index+1);
			}
			arr[index] = -arr[index];
		}
		return duplicates;
	}
}
