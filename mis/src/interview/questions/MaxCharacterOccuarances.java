/*
 * Program to calculate maximum character occurrence in a string  
 */

package interview.questions;

import java.util.HashSet;
import java.util.Scanner;

public class MaxCharacterOccuarances {
	
	static int count = 0;

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string:");
		str = sc.next().trim().toLowerCase();
		
		int count = maxCharCount(str);
		System.out.println("\nCount: "+count);
		sc.close();
	}
	
	public static int maxCharCount(String str) {
        char strChar[];
        if(str.length() > 0) {
        	HashSet<Character> charSet = new HashSet<Character>();
        	strChar = new char[str.length()];
        	strChar = str.toString().toCharArray();
        	for(char c: strChar) {
        		charSet.add(c);
        	}
        	
        	charSet.forEach((Character ch) -> {
        		String[] tempCharString;
        		tempCharString = str.split(ch.toString());
        		
        		System.out.println("tempCharString: "+ch+" :" + tempCharString.length);
        		
                if((tempCharString.length-1) > count) {
                	count = tempCharString.length - 1;
                }
            });
        	return count;
        }else {
        	return count;
        }
    }

}
