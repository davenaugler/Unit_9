package com.coderscampus.lesson5;

import java.util.HashMap;
import java.util.Map;

public class MapsApplication {

	public static void main(String[] args) {
		// MAPS! Where the magic happens!
		// Map is a data structure and a collection
		// Types of data that a Map stores
		
		// Key == SSN
		// Value == Person's Name 
		Map<Integer, String> people = new HashMap<>();
		// HashMaps store data as Key / Value Pairs
		// Shorthand is            K / V
		// The purpose of a data structure is to store and retrieve data in an efficent manner
		
		// C - Create
		people.put(323232323, "Dave Naugler");
		people.put(121212121, "Josh Bradeno");
		people.put(787878787, "Jane Doe");
		people.put(656565654, "Elon Musk");
		people.put(656565654, "John Doe");
		
		// R - Read
		System.out.println("Get data using an invalid key");
		System.out.println(people.get(123456789));
		
		System.out.println("");
		
		System.out.println("Get data using a valid key");
		System.out.println(people.get(323232323));
		
		System.out.println("");
		
		// U - Update
		System.out.println("Get data using a duplicated key");
		System.out.println(people.get(656565654));
		
		System.out.println("");
		
		// D - Delete
		System.out.println(people.remove(323232323));
		System.out.println("Get data using an invalid key. This was just removed");
		System.out.println(people.get(323232323));
		
		
		
		

	}

}
