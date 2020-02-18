/*
 * Hash Set implementation with integer
 */
package collection.impl;

import java.util.Collection;
import java.util.HashSet;

public class HashSetInt {

	public static void main(String[] args) {
		Collection<Integer> hs = new HashSet<Integer>();
		for(int i=1;i<=5;i++) {
			hs.add(i*5);
		}
		hs.add(5);
		hs.add(null);
		
		System.out.println(hs);
	}

}
