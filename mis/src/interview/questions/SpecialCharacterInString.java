/*
 * Special character in a string
 * Input "abcrufhh" is valid return false (output)
 * Input "abcr$ufhh" is in-valid return true (output)
 */
package interview.questions;
import java.util.Scanner;
public class SpecialCharacterInString {
	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		name = sc.next();
		System.out.println(SpecialCharacterInString.checkForSpecialChar(name));
		sc.close();
	}
	
	public static boolean checkForSpecialChar(String str) {
		int charAscii;
		int specialCharCount = 0;
		for(int i=0; i<str.length(); i++) {
			charAscii = (int)str.charAt(i);
			//System.out.println(charAscii);
			if(!((charAscii>=97) && (charAscii<=122) || (charAscii>=65) && (charAscii<=90))) {
				specialCharCount ++;
			}
		}
		if(specialCharCount > 0) {
			return true;
		}
		return false;
	}
	
}
