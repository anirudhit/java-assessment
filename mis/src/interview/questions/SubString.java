/*
 * Substring implementation and understanding internal working
 */
package interview.questions;

public class SubString {

	public static void main(String[] args) {
		String str1 = "java code";
		System.out.println("str1: "+str1);
		System.out.println("str1 length : "+str1.length());
		
		// Using subString(int beginIndex);
		String str2 = str1.substring(0);
		System.out.println("\nstr2: "+str2);
		System.out.println("Comparing str1, str2: " + (str1 == str2));
		
		String str3 = str1.substring(1);
		System.out.println("\nstr3: "+str3);
		System.out.println("Comparing str1, str3: " + (str1 == str3));
		
		System.out.println("**************************");
		
		// Using subString(int beginIndex);
		String str4 = str1.substring(0,9);
		System.out.println("\nstr4: "+str4);
		System.out.println("Comparing str1, str4: " + (str1 == str4));
		
		String str5 = str1.substring(0,8);
		System.out.println("\nstr5: "+str5);
		System.out.println("Comparing str1, str5: " + (str1 == str5));
		
		
		
		// Exceptions => we get StringIndexOutOfBoundsException for the below three conditions
		// System.out.println(str1.substring(-1));
		// System.out.println(str1.substring(20));
		// System.out.println(str1.substring(5, 3));
	}

}
