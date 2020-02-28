/*
 * Check match pattern using regex and char sequence 
 */
package regex.impl;
import java.util.regex.Pattern;

public class CharacterExample {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[xyz]", "xwbcd"));// (false not x or y or z)
		System.out.println(Pattern.matches("[xyz]", "y"));// (true among x or y or z)
		System.out.println(Pattern.matches("[xyz]", "xxyyyz"));// (false x and y comes more than once)
	}

}
