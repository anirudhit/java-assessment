/*
 * Finding if two strings are anagrams are not
 * Given a st1 =  "abac", str2 = "caba"
 * Output = "str1, str2 are anagrams"
 */

package interview.questions;

public class StringAnagram {

	public static void main(String[] args) {
		String str1 = "abac";
		String str2 = "caba";
		boolean isAnagram = checkAnagrams(str1,str2);
		if(isAnagram) {
			System.out.println("str1, str2 are anagrams");
		}else {
			System.out.println("str1, str2 are not anagrams");
		}
	}
	public static boolean checkAnagrams(String str1, String str2) {
		System.out.println("str1: "+str1);
		System.out.println("str2: "+str2);
		if(str1.length() != str2.length()) {
			return false;
		}else {
			int chCount[] = new int[1<<8];
			
			for(char ch: str1.toLowerCase().toCharArray()) {
				chCount[ch] = chCount[ch]+1;
			}
			
			for(char ch: str2.toLowerCase().toCharArray()) {
				chCount[ch] = chCount[ch]-1;
			}
			
			for(int chVal: chCount) {
				if(chVal > 0) {
					return false;
				}
			}
			return true;
		}
	}
}
