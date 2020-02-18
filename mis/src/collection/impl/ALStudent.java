/*
 * Linked list implementation with Student generic
 */
package collection.impl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ALStudent {
	public static void main(String[] args) {
		LinkedList<Student> as = new LinkedList<Student>();
		as.add(new Student(1,"john","doe","AL"));
		as.add(new Student(2,"Michel","dong","AL"));
		as.add(new Student(3,"Tony","Hawk","AL"));
		as.add(new Student(4,"Nick","Chin","AL"));
		
		System.out.println("Size: "+as.size());
		
		System.out.println("Forward order: ");
		Iterator<Student> is = as.iterator();
		while(is.hasNext()) {
			System.out.println(is.next());
		}
		
		System.out.println("First: "+as.getFirst());
		System.out.println("Last: "+as.getLast());
		
		ListIterator<Student> lis = as.listIterator();
		System.out.println("Reverse order: ");
		while(lis.hasNext()) {
			System.out.println(lis.next());
		}
		
	}
}
