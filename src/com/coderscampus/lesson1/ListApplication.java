package com.coderscampus.lesson1;

import java.util.ArrayList;
import java.util.List;

public class ListApplication {

	public static void main(String[] args) {
		String[] names = new String[4];
		
		names[0] = "Dave Naugler";
		names[1] = "John Doe";
		names[2] = "Jane Doe";
		names[3] = "Elon Musk";
		
		names[1] = null;
		
		System.out.println("Arrays Example: ");
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("------------");
		System.out.println(" ");
		
		
		// Collections -> Java solution to common data structure problems
		// List (a type of Collection)
		// Set (a type of Collection)
		// Map (a type of Collection)
		
		
		// Data type, <genarics> aka Strings here, variable name, assignment
		List<String> elements = new ArrayList<String>();
//		elements.add("Josh Someone");
		elements.add("Dave Naugler");
		elements.add("John G."); 
		elements.add("Jane Doe");
		elements.add("Elone Musk");
		elements.add("Josh Someone");
		
	
		System.out.println("List Example: ");
		printArrayListToConsole(elements);
		System.out.println("List NEW Example: ");
		elements.remove(1);
		printArrayListToConsole(elements);
		elements.remove("Josh Someone");
		printArrayListToConsole(elements);
		
	
		
		

	}

	private static void printArrayListToConsole(List<String> elements) {
		for (String element : elements) {
			System.out.println(element);
		}
		System.out.println("");
	}

}
