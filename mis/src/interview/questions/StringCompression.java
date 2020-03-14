/*
 * Given a string, write a function to compress it by shortening every sequence of the same character
 * to that character followed by the number of repetitions. If the compressed string is longer than the
 * original, you should return the original string
 * eg:
 * compress("a") = a
 * compress("aaa") = a3
 * compress("aaabbb") = a3b3
 * compress("aaabccc") = a3b1c3
 */
package interview.questions;

public class StringCompression {
	public static void main(String[] args) {
		String str = "aaabccc";
		String compressedStr = compress(str);
		System.out.println("Compressed string: " + compressedStr);
	}
	
	public static String compress(String str) {
		System.out.println("Entered string: "+str);
		int chCount = 1;
		String cmpStr = "";
		for(int i = 0; i<str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				chCount = chCount + 1;
			}else {
				cmpStr = cmpStr +  str.charAt(i) + chCount;
				chCount = 1;
			}
		}
		cmpStr = cmpStr + str.charAt(str.length() - 1) + chCount;
		if(cmpStr.length() > str.length()) {
			return str;
		}else {
			return cmpStr;
		}
	}
}
