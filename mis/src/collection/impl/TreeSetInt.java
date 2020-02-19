/*
 * Tree Set implementation with integer
 */
package collection.impl;

import java.util.Collection;
import java.util.TreeSet;

public class TreeSetInt {

	public static void main(String[] args) {
		Collection<Integer> ts = new TreeSet<Integer>();
		for(int i=5; i>=1; i--) {
			ts.add(5*i);
		}
		System.out.println("Size: "+ts.size());
		System.out.println(ts);
	}

}
