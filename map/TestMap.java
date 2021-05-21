package dev.carbajal.map;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {

		HashMap<String, String> dictionary = new HashMap<>();

		dictionary.put("apple", "A forbidden fruit.");
		dictionary.put("banana", "A yellow fruit that can be peeled.");
		dictionary.put("canteloupe", "A melon fruit that has an orange flesh.");

		System.out.println(dictionary);

		// Get value from map using key

		System.out.println(dictionary.get("apple"));

		//or

		String key = "apple";
		String value = dictionary.get(key);
		System.out.println("The value for the key: " + key + " is " + value);

		// Define a new TreeMap

		TreeMap<String, String> sortedDictionary = new TreeMap<>();
		sortedDictionary.putAll(dictionary);
		System.out.println(sortedDictionary);

		// Add another element

		sortedDictionary.put("beets", "An actual vegetable.");
		System.out.println(sortedDictionary);

		// Re-add another element

		sortedDictionary.put("beets", "A better explanation.");
		System.out.println(sortedDictionary);
		
		// Create a set of keys
		
		Set<String> keys = sortedDictionary.keySet();
		
		for (String s : keys) {
			
			System.out.println("key: " + s);
			
		}

	}

}
