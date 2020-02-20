/*
 * Tree set implementation using Object, string and Laptop generic. 
 */
package collection.impl.set;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetImpl {

	public static void main(String[] args) {
		
		// Implementation with object
		TreeSet<Object> tsO = new TreeSet<Object>();
		tsO.add("UAH");
		tsO.add("Jones");
		tsO.add("Amanda");
		//tsO.add(2527);
		System.out.println("Object vector: ");
		System.out.println(tsO);
		
		
		// Implementation with String generic
		TreeSet<String> tsS = new TreeSet<String>();
		tsS.add("UAH");
		tsS.add("John");
		tsS.add("Doe");
		tsS.add("UAH");
		System.out.println("String vector: ");
		System.out.println(tsS);
		
		// Implementation with Laptop generic
		TreeSet<Laptop> tsLaptop = new TreeSet<Laptop>();
		
		// Laptop objects
		// L1 and L2 with same laptop details
		// L3 and L5 with same price
		Laptop l1 = new Laptop("Dell", 12, 800);
		Laptop l2 = new Laptop("Apple", 8, 1100);
		Laptop l3 = new Laptop("Acer", 16, 700);
		Laptop l4 = new Laptop("Dell", 12, 800);
		Laptop l5 = new Laptop("Xiomi", 12, 700);
		
		tsLaptop.add(l1);
		tsLaptop.add(l2);
		tsLaptop.add(l3);
		tsLaptop.add(l4);
		tsLaptop.add(l5);
		
		System.out.println("\nLaptop object details (Default using comparable from Laptop generic)");
		tsLaptop.forEach(System.out::println);
		
		// Sorting implementation (with Comparator for laptop - ram member variable)
		
		// Comparator for laptop with ram attribute
		Comparator<Laptop> cmLaptopRam = new Comparator<Laptop>(){

			@Override
			public int compare(Laptop l1, Laptop l2) {
				if((l1.getBrand() == l2.getBrand()) && (l1.getRam() == l2.getRam()) && (l1.getPrice() == l2.getPrice())) {
					return 0;
				}
				if(l1.getRam() > l2.getRam()) {
					return 1;
				}else {
					return -1;
				}
			}
			
		};
		
		// Collections.sort(tsLaptop, cmLaptopRam);
		// System.out.println("\nLaptop object details (Default using comparable from Laptop generic)");
		// tsLaptop.forEach(System.out::println);
		
	}

}
