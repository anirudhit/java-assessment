/*
 * Hash map implementation.
 */
package collection.impl.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapImpl {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("firstName", "John");
		map.put("lastName", "Doe");
		map.put("college","uah");
		
		System.out.println("Hash map data: ");
		System.out.println(map);
		System.out.println("Firstname: "+map.get("firstName"));
		
		Set<String> mapKeys = map.keySet();
		for(String key : mapKeys) {
			System.out.println(key + " " +map.get(key));
		}
	}
}
