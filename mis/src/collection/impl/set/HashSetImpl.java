/*
 * Hash set implementation using String and Student generic.
 */
package collection.impl.set;

import java.util.HashSet;
import java.util.Iterator;

import collection.impl.set.Student;

public class HashSetImpl {

	public static void main(String[] args) {
		
		HashSet<String> hsS = new HashSet<String>();
		hsS.add("UAH");
		hsS.add("John");
		hsS.add("UAH");
		hsS.add("Dowe");
		hsS.add("UAH");
		hsS.add(null);
		hsS.add(null);
		hsS.add(null);
		
		// Print Hash set
		System.out.println("Hash set: "+hsS);
		
		// Size of Hash set
		System.out.println("\nHash set size: "+hsS.size());
		
		// Print using iterator
		Iterator<String> hsI = hsS.iterator();
		System.out.println("\nHash set with iterator: ");
		while(hsI.hasNext()) {
			System.out.println(hsI.next());
		}
		System.out.println();
		
		// Print using enhanced for loop
		System.out.println("\nHash set with enhanced for loop: ");
		for(String eachVal: hsS) {
			System.out.println(eachVal);
		}
		
		// Using student generic for the Hash set
		HashSet<Student> hsStu = new HashSet<Student>();
		Student s1 = new Student(3, "John", "M");
		Student s2 = new Student(4, "Sarah", "F");
		Student s3 = new Student(1, "Mitchel", "F");
		Student s4 = new Student(2, "Hanna", "F");
		hsStu.add(s1);
		hsStu.add(s2);
		hsStu.add(s3);
		hsStu.add(s3);
		
		// Printing the student details from the Hash set using enhanced for loop
		System.out.println("\nStudent details from the hash set: ");
		// Size of student Hash set
		System.out.println("Hash set student size: "+hsStu.size());
		
		for(Student s : hsStu) {
			System.out.println("ID: "+s.getId()+", First name: "+s.getFirstName()+", Gender:"+s.getGender());
		}
		
		// Adding new object to student hash set
		hsStu.add(s4);
		System.out.println("\nUpdated student details from the hash set: ");
		// Size of student Hash set
		System.out.println("Hash set student size: "+hsStu.size());
		
		for(Student s : hsStu) {
			System.out.println("ID: "+s.getId()+", First name: "+s.getFirstName()+", Gender:"+s.getGender());
		}
		
		
	}

}
