/*
 * Removing a given character from the String
 */
package interview.questions;

public class RemoveCharInString {

	public static void main(String[] args) {
		char ch = 'o';
		String str = "John Doe";
		System.out.println("Original string:" + str);
		String rmStr = removeCharFromString(str,ch);
		System.out.println("Updated string: "+ rmStr);
	}
	
	public static String removeCharFromString(String str, char ch) {
		if(str == null) {
			return str;
		}else {
			return str.replaceAll(Character.toString(ch), "");
		}
	}

}
