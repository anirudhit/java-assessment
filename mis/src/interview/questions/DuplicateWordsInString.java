/*
 * Find duplicate words in a string
 * Given a string "I am am learning java java", the duplicates am, java should be returned
 * Input = "I am am learning java java"
 * Output = "am, java"
 */
package interview.questions;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateWordsInString {
	
	public static void main(String[] args) {
		String str = "I am am learning java java";
		findDuplicateWordsInString(str);
	}
	
	static void findDuplicateWordsInString(String str) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String s[] = str.split(" ");
		
		for(String tempStr : s) {
			if(hm.get(tempStr) != null) {
				hm.put(tempStr, hm.get(tempStr) + 1);
			}else {
				hm.put(tempStr, 1);
			}
		}
		
		Iterator<String> keyIt = hm.keySet().iterator();
		while(keyIt.hasNext()) {
			String tempKey = keyIt.next();
			if(hm.get(tempKey) > 1) {
				System.out.println(tempKey + " has occured "+ hm.get(tempKey)+ " times.");
			}
		}
	}

}
