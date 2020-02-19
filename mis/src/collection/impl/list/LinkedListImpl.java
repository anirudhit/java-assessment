/*
 * Linked list implementation using Object, float, string and Student generic. 
 */
package collection.impl.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListImpl {
	public static void main(String[] args) {
		
		// Linked list with object
		LinkedList<Object> llO = new LinkedList<Object>();
		llO.add(1);
		llO.add("John");
		llO.add("Doe");
		System.out.println("llO obj: "+llO);
		System.out.println("Size: "+llO.size());
		System.out.println("First value: "+llO.getFirst());
		System.out.println("Last value: "+llO.getLast());
		llO.add(1, "UAH");
		System.out.println("llO updated obj: "+llO);
		
		// Linked list with float
		LinkedList<Float> llF = new LinkedList<Float>();
		llF.add(5.34f);
		llF.add(3.14f);
		llF.add(7.23f);
		System.out.println("\n\nllF obj: "+llF);
		System.out.println("Size: "+llF.size());
		Collections.sort(llF);
		System.out.println("Sorted list: "+llF);
		llF.addFirst(6.02f);
		System.out.println("Updated obj: "+llF);
		System.out.println("Size: "+llF.size());
		Collections.sort(llF);
		System.out.println("Sorted list: "+llF);
		
		// Linked list with student generic
		LinkedList<Student> llS = new LinkedList<Student>();
		// Creating student objects with id as Integer
		Student sL1 = new Student(3, "John", "Doe","M");
		Student sL2 = new Student(4, "Sarah", "Jones","F");
		Student sL3 = new Student(1, "Mitchel", "Gray","F");
		Student sL4 = new Student(2, "Chris", "Allen","M");
		
		llS.add(sL1);
		llS.add(sL2);
		llS.add(sL3);
		
		//Iterator to display student info
		Iterator<Student> iS = llS.iterator();
		System.out.println("\n\niiS obj: ");
		while(iS.hasNext()) {
			Student s = iS.next();
			System.out.println("id: "+s.id+", First name: "+s.firstName+", Last name: "+s.lastName+", Gender: "+s.gender);
		}
		
		//Sorted student data
		Collections.sort(llS);
		System.out.println("\nSorted iiS obj: ");
		for(Student s: llS) {
			System.out.println("id: "+s.getId()+", First name: "+s.getFirstName()+", Last name: "+s.getLastName()+", Gender: "+s.getGender());
		}
		
		// Adding a new student
		llS.add(0, sL4);
		System.out.println("\nUpdated iiS obj: ");
		for(Student s: llS) {
			System.out.println("id: "+s.getId()+", First name: "+s.getFirstName()+", Last name: "+s.getLastName()+", Gender: "+s.getGender());
		}
		
		//Sorted student data
		Collections.sort(llS);
		System.out.println("\nSorted iiS obj: ");
		for(Student s: llS) {
			System.out.println("id: "+s.getId()+", First name: "+s.getFirstName()+", Last name: "+s.getLastName()+", Gender: "+s.getGender());
		}
		
	}
}
