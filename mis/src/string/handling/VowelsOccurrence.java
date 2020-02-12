/* Program to count vowels occurrences. */
package string.handling;

import java.util.Scanner;

public class VowelsOccurrence {

	public static void main(String[] args) {
		String str;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		str = scanner.nextLine();
		
		char ch[] = str.toLowerCase().toCharArray();
		int vowelCount = 0;
		for(char c: ch) {
			if((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
				vowelCount++;
			}
		}
		System.out.println("\""+str+"\""+" has "+vowelCount+ " vowels");
		
		scanner.close();
	}

}
