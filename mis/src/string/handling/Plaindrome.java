/* Program to check if string is palindrome( aba=aba) */
package string.handling;

import java.util.Scanner;

public final class Plaindrome {
	public static void main(String[] args) {
		String str;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		str = scanner.nextLine();
		
		char ch[] = str.toLowerCase().toCharArray();
		int totChar = ch.length;
		
		for(int i=0;i<(totChar)%2;i++) {
			if(i < (totChar-i)) {
				if(ch[i] != ch[totChar-1]) {
					count++;
				}
			}
		}
		
		if(count == 0) {
			System.out.println(str+" is palindrome");
		}else {
			System.out.println(str+" is not palindrome");
		}
		
		scanner.close();
	}
}
