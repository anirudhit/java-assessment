/*
 * Linked list implementation using float type
 */
package collection.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class LLCollectionFloat {

	public static void main(String[] args) {
		Collection<Float> fc = new LinkedList<Float>();
		fc.add(1234.5f);
		fc.add(432.7f);
		fc.add(231.89f);
		
		System.out.println("Collection size: "+fc.size());
		System.out.println(fc);
		
		Iterator<Float> fi = fc.iterator();
		while(fi.hasNext()) {
			System.out.println(fi.next());
		}

	}

}
