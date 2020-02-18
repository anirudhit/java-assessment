/*
 * Array list implementation using integer type
 */
package collection.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ALCollectionInt {

	public static void main(String[] args) {
		Collection<String> cstr = new ArrayList<String>();
		cstr.add("John");
		cstr.add("Doe");
		cstr.add("UAH");
		
		System.out.println("CSTR: "+ cstr);
		System.out.println("Size: "+cstr.size());
		System.out.println("CSTR iterator: ");
		Iterator<String> citr = cstr.iterator();
		while(citr.hasNext()) {
			System.out.println(citr.next());
		}

	}

}
