/*
 * Finding the largest and smallest number in an array
 */
package interview.questions;

public class FindMinAndMaxInAnArray {

	public static void main(String[] args) {
		int numArr[] = {10,4,8,12,16,3,7,34,58,28,2,34,56,9,18};
		findMinAndMaxNumbers(numArr);
	}
	
	public static void findMinAndMaxNumbers(int numArr[]) {
		int minNumber = numArr[0];
		int maxNumber = numArr[0];
		for (int i=0;i<numArr.length;i++) {
			if(minNumber > numArr[i]) {
				minNumber = numArr[i];
			}
			if(numArr[i] > maxNumber) {
				maxNumber = numArr[i];
			}
		}
		System.out.println("Smallest number:" + minNumber);
		System.out.println("Largest number:" + maxNumber);
	}

}
