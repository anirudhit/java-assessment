/*
 * Reverse of string
 */
package interview.questions;

public class StringReverse {

	public static void main(String[] args) {
		String str = "JohnDoe";
		stringReverseWithCharArray(str);
		stringReverseWithStringBuffer(str);
		stringReverseWithStringBuilder(str);
	}
	
	// String reverse with char array
	public static void stringReverseWithCharArray(String str) {
		char chArr[] = str.toCharArray();
		System.out.println("String reverse with char array:");
		System.out.println("String:\t\t"+str);
		System.out.print("Reverse:\t");
		for(int i=chArr.length-1;i>=0;i--) {
			System.out.print(chArr[i]);
		}
		System.out.print("\n");
	}
	
	// String reverse with string buffer
	public static void stringReverseWithStringBuffer(String str) {
		StringBuffer sb = new StringBuffer(str);
		System.out.println("String reverse with string buffer:");
		System.out.println("String:\t\t"+sb);
		System.out.println("Reverse:\t"+sb.reverse());
	}
	
	// String reverse with string builder
	public static void stringReverseWithStringBuilder(String str) {
		StringBuilder sb = new StringBuilder(str);
		System.out.println("String reverse with string builder:");
		System.out.println("String:\t\t"+sb);
		System.out.println("Reverse:\t"+sb.reverse());
	}

}
