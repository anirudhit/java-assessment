/*
 * N'th Fibonacci value with recursion.
 */
package interview.questions;

import java.util.Scanner;

public class FibonacciNthValWithRecursion {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value: ");
		n = sc.nextInt();
		
		System.out.println(calcNthFibonacciValue(n));
		sc.close();
	}
	
	public static int calcNthFibonacciValue(int n) {
		if(n == 0)
			return 0;
		else if((n == 1) || (n==2))
			return 1;
		else
			return calcNthFibonacciValue(n-1)+calcNthFibonacciValue(n-2);
	}
}
