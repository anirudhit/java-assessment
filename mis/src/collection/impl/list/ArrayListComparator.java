package collection.impl.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListComparator {

	public static void main(String[] args) {
		
		List<Laptop> laptop = new ArrayList<Laptop>();
		laptop.add(new Laptop("Dell", 12, 800));
		laptop.add(new Laptop("Apple", 8, 1100));
		laptop.add(new Laptop("Sony", 16, 700));
		
		System.out.println("Laptop list: ");
		for(Laptop l : laptop) {
			System.out.println(l);
		}
		
		// Sorting laptop list based on the laptop ram
		Collections.sort(laptop);
		// Implemented sort by overriding compareTo in Laptop class which implemented comparable
		System.out.println("\nSorted laptop list: (Comparable) ");
		for(Laptop l : laptop) {
			System.out.println(l);
		}
		
		// Sorting laptop list using comparator(Sorting with price)
		Comparator<Laptop> sortByLaptopRam = new Comparator<Laptop>() {
			@Override
			public int compare(Laptop l1, Laptop l2) {
				if(l1.getPrice() > l2.getPrice()) {
					return 1;
				}else {
					return -1;
				}
			}
		};
		// Sorting laptop list based on the laptop price
		Collections.sort(laptop,sortByLaptopRam);
		// Implemented sort by overriding compareTo in Laptop class which implemented comparable
		System.out.println("\nSorted laptop list: (Comparator on Price) ");
		for(Laptop l : laptop) {
			System.out.println(l);
		}
		
		// Sorting laptop list using comparator(Sorting with price)
		// Ascending order  = l1.getBrand().compareTo(l2.getBrand())
		// Descending order = -(l1.getBrand().compareTo(l2.getBrand()))
		Comparator<Laptop> sortByLaptopBrand = new Comparator<Laptop>() {
			@Override
			public int compare(Laptop l1, Laptop l2) {
				return l1.getBrand().compareTo(l2.getBrand());
			}
		};
		// Sorting laptop list based on the laptop brand
		Collections.sort(laptop,sortByLaptopBrand);
		// Implemented sort by overriding compareTo in Laptop class which implemented comparable
		System.out.println("\nSorted laptop list: (Comparator on Brand) ");
		for(Laptop l : laptop) {
			System.out.println(l);
		}
		
		
	}

}
