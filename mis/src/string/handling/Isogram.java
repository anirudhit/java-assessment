/* Program to check if string is isogram. ( An Isogram is a string in which no letter occurs more than once.) */
package string.handling;

import java.util.Scanner;

public class Isogram {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		str = sc.nextLine().toLowerCase();
		
		char ch[] = str.toCharArray();
		int chRepeatCount = 0;
		for(char c: ch) {
			if(str.indexOf(c) != str.lastIndexOf(c)) {
				chRepeatCount++;
			}
		}
		
		if(chRepeatCount == 0) {
			System.out.println("The string is Isogram");
		}else {
			System.out.println("The string is not Isogram");
		}
		
		sc.close();
	}

}
