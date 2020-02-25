/*
 * Fibonacci series with recursion
 */
package interview.questions;
import java.util.Scanner;

public class FibonacciSeriesWithRecursion {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value: ");
		n = sc.nextInt();
		
		for(int i = 0;i<n;i++) {
			System.out.println(fibSeries(i));
		}
		sc.close();
	}
	
	public static int fibSeries(int n) {
		if(n == 0)
			return 0;
		else if((n == 1) || (n==2))
			return 1;
		else
			return fibSeries(n-1)+ fibSeries(n-2);
	}

}
