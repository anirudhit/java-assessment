/*
 * Array list implementation using Object, int, string and Student generic. 
 */
package collection.impl.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListImpl {

	public static void main(String[] args) {
		
		// Array list with object
		List<Object> obj = new ArrayList<>();
		obj.add(1208);
		obj.add("John");
		obj.add("Doe");
		
		//Array list with Integer
		List<Integer> objI = new ArrayList<Integer>();
		objI.add(1);
		objI.add(4);
		objI.add(3);
		System.out.println("objI:		"+objI);
		System.out.println("Size of objI:	"+objI.size());
		//Sorting the Integer list
		Collections.sort(objI);
		System.out.println("Sorted objI:	"+objI);
		//Inserting an element in the list
		objI.add(1, 5);
		System.out.println("After insert:	"+objI);
		//Sorting the Integer list
		Collections.sort(objI);
		System.out.println("Sorted objI:	"+objI);
		System.out.println("Size of objI:	"+objI.size());
		
		//Array list with String
		List<String> objS = new ArrayList<String>();
		objS.add("Sports");
		objS.add("Cultural");
		objS.add("Music");
		System.out.print("\n\n");
		System.out.println("objS: "+objS);
		System.out.println("objS size: "+objS.size());
		Collections.sort(objS);
		System.out.println("Sorted list: "+objS);
		objS.add(1, "Classes");
		System.out.println("objS updated: "+objS);
		//Sorting the Integer list
		System.out.println("Size of updated objS:	"+objS.size());
		Collections.sort(objS);
		System.out.println("Sorted updated objS:	"+objS);
		
		//Creating student objects with id as Integer
		Student sI1 = new Student(3, "John", "Doe","M");
		Student sI2 = new Student(4, "Sarah", "Jones","F");
		Student sI3 = new Student(1, "Mitchel", "Gray","F");
		Student sI4 = new Student(2, "Chris", "Allen","M");
		
		//Array list student generic making id as Integer
		List<Student> studentI = new  ArrayList<>();
		studentI.add(sI1);
		studentI.add(sI2);
		studentI.add(sI3);
		System.out.println("\n\nStudent data: ");
		for(Student s: studentI) {
			System.out.println("Id: "+s.id+", First name: "+s.firstName+", Last name: "+s.lastName);
		}
		System.out.println("Student list size: "+studentI.size());
		
		//Sorted student data
		Collections.sort(studentI);
		System.out.println("\nSorted student data: ");
		for(Student s: studentI) {
			System.out.println("Id: "+s.id+", First name: "+s.firstName+", Last name: "+s.lastName);
		}
		
		// Adding a new student
		studentI.add(2, sI4);
		System.out.println("\nUpdated student data: ");
		for(Student s: studentI) {
			System.out.println("Id: "+s.id+", First name: "+s.firstName+", Last name: "+s.lastName);
		}
		System.out.println("Updated student list size: "+studentI.size());
		
		//Sorted student data
		Collections.sort(studentI);
		System.out.println("\nSorted student data: ");
		for(Student s: studentI) {
			System.out.println("Id: "+s.id+", First name: "+s.firstName+", Last name: "+s.lastName);
		}
		

	}

}
