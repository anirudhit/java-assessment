/*
 * Find duplicate characters in a string
 * Given a string "abfgadf", the duplicates am, java should be returned
 * Input = "abfgadf"
 * Output = "a, f"
 */
package interview.questions;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateCharactersInString {
	public static void main(String[] args) {
		String str = "abFgadfaf";
		findDuplicateCharacterInString(str);
	}
	public static void findDuplicateCharacterInString(String str) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(char ch : str.toCharArray()) {
			if(hm.get(ch) != null) {
				hm.put(ch, hm.get(ch) + 1);
			}else {
				hm.put(ch, 1);
			}
		}
		
		Iterator<Character> chIt = hm.keySet().iterator();
		while (chIt.hasNext()) {
			char tempCh = chIt.next();
			if(hm.get(tempCh) > 1) {
				System.out.println("Character " + tempCh + " has occured "+ hm.get(tempCh) + " times");
			}
		}
	}
}
