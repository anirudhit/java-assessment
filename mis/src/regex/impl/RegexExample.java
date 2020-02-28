/*
 * Check match pattern and use contain method of String with CharSequence 
 */

package regex.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {
		// .xx. => Match with eg: AxxZ or 
		Pattern pattern = Pattern.compile(".xx.");
		Matcher matcher = pattern.matcher("Axxz");
		System.out.println("String matches the given regex: "+matcher.matches());
		
		CharSequence ch = "xx";
		String str = "JOxHxNxxxDoe";
		System.out.println("Char sequence: "+ch+" in str: "+str+" :: "+str.contains(ch));
		
	}

}
