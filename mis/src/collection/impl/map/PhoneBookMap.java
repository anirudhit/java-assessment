/*
 * Hash map implementation with Contact generic.
 * Iterating phone book map using enhanced for loop, and iterator.
 */

package collection.impl.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PhoneBookMap {

	public static void main(String[] args) {
		
		Map<String, Contact> phoneBookMap = new HashMap<String, Contact>();
		phoneBookMap.put("jd0218@uah.edu", new Contact("John", "Doe", "Adobe", 2345612));
		phoneBookMap.put("ts0318@uah.edu", new Contact("Tony", "Stark", "Uah", 2345612));
		
		System.out.println("Phone book map size: "+phoneBookMap.size());
		
		// Mapping keys to a set and printing keys
		Set<String> phoneBookKeys = phoneBookMap.keySet();
		System.out.println("Phone Book Keys: ");
		phoneBookKeys.forEach((key) -> {
			System.out.println("Key: " + key);
		});
		
		// Printing phone book values using enhanced for loop
		System.out.println("Phone Book Values with enhanced for loop: ");
		for (Contact contactValue : phoneBookMap.values())  
            System.out.println("value: " + contactValue);
		
		// Printing key values using iterator
		System.out.println("Using iterator and printing phone book keys and values: ");
		Iterator<String> phoneIterator = phoneBookKeys.iterator();
		while (phoneIterator.hasNext()) {
			String phoneBookKey = phoneIterator.next();
			System.out.println("KEY: "+phoneBookKey);
			System.out.println("VALUE: "+phoneBookMap.get(phoneBookKey));
		}
		
	}

}
