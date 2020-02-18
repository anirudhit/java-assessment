/*
 * Array list implementation using object type
 */
package collection.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ALCollectionObject {

	public static void main(String[] args) {
		Collection<Object> al = new ArrayList<Object>();
		al.add("John");
		al.add("Doe");
		al.add(1208);
		al.add("UAH");
		
		System.out.println(al);
		System.out.println("Size of Array List: "+ al.size());
		
		String str = "UAH";
		System.out.println("List contains " +str+ " : "+al.contains(str));
		
		Iterator<Object> iterator = al.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
