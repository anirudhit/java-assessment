/* Program to calculate sum of all numbers present in the string. */
package string.handling;

import java.util.Scanner;

public class SumInAlphaNumeric {

	public static void main(String[] args) {
		String str;
		int sum = 0;
		int chAscii;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter alphanumeric string: ");
		str = sc.nextLine();
		char ch[] = str.toCharArray();
		for(char c: ch) {
			chAscii = (int)c;
			if(chAscii >=48 && chAscii <= 57) {
				sum += Integer.parseInt(String.valueOf(c));
			}
		}
		System.out.println("For string "+str+" sum: "+sum);
		sc.close();

	}

}
