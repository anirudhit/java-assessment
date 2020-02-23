/*
 * Comparator implementation with ArrayList of integers using
 * Default sort, using comparator, comparator with anonymous class
 * comparator with lambda expression, comparator with anonymous method
 */
package collection.impl.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListComparatorImpl {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(457);
		al.add(234);
		al.add(152);
		al.add(831);
		al.add(556);
		
		System.out.println("Initial list: ");
		for(int i : al) {
			System.out.print(i+" ");
		}
		
		// Default sort
		System.out.println("\nDefault sort: ");
		Collections.sort(al);
		for(int i : al) {
			System.out.print(i+" ");
		}
		
		// Sorting using comparator, sorting based on the last number in ascending order
		System.out.println("\nSorting using comparator: (based on the last number in ascending order)");
		Comparator<Integer> cl = new ListComparator();
		Collections.sort(al,cl);
		for(int i : al) {
			System.out.print(i+" ");
		}
		
		// Sorting using comparator with anonymous class, sorting based on the last two number in ascending order
		System.out.println("\nSorting using Anonymous class: (based on the last two number in ascending order)");
		Comparator<Integer> afcl = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if((o1%100) > (o2%100))
					return 1;
				return -1;
			}
		};
		Collections.sort(al,afcl);
		for(int i : al) {
			System.out.print(i+" ");
		}
		
		// Sorting using comparator with lambda expression, sorting the numbers in descending order
		System.out.println("\nSorting using lambda expression: (numbers in descending order)");
		Comparator<Integer> lcl = (Integer o1, Integer o2) -> {
			if(o1 < o2)
				return 1;
			return -1;
		};
		Collections.sort(al,lcl);
		for(int i : al) {
			System.out.print(i+" ");
		}
		
		// Sorting using comparator with anonymous method, sorting the numbers in ascending order
		System.out.println("\nSorting using lambda expression: (numbers in ascending order)");
		Collections.sort(al,(o1,o2) -> {
			return o1>o2?1:-1;
		});
		for(int i : al) {
			System.out.print(i+" ");
		}

	}

}
