package com.coderscampus.I_Lesson8__Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdasApp {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Dave Naugler");
		names.add("John Doe");
		names.add("Jane Doe");
		names.add("Elon Musk");
		names.add("Frank Beard");

		// Sort in Acceding order using Collections because we are sorting a List
		Collections.sort(names);
		System.out.println("[ Acceding order of names ]");
		printArrayListToConsole(names);

		// Sort in Descending order using Collections because we are sorting a List
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String name1, String name2) {
				return name2.compareTo(name1);
			}
		});
		
		// What is a Lambda?
		// Lambdas can only be used with a Functional Interface (Functional Interface annotation) and defines only one 
		// abstract method inside of it. Once that's in place it opens up some really poweful things.
		// A Lambda is a method signature to the left of an arrow '->' and potentially
		// a full block of code to the right or a more succinct version which is just a return statement to the right.
		// 

		// Example 1 of Lambdas (more verbose)
		// Start off with what you are comparing -> Then tell what you are returning
		Collections.sort(names, (String name1, String name2) -> name2.compareTo(name1));

		// Example 2: Conciseness
		// Example of Lambda sort
		// Lambdas can be reduced to this
		// You can put String before name1 and name2 but you don't need too.
		Collections.sort(names, (name1, name2) -> name2.compareTo(name1));

		// Example 3 (even more verbose), note: not the same functionality as above examples
		// because we are doing some null checks
		Collections.sort(names, (String name1, String name2) -> {
			// Good idea to have the following if statement to avoid NullPointerExceptions
			if (name2 != null && name1 != null) {
				return name2.compareTo(name1);
			} else {
				return 0;
			}

		});

		System.out.println("[ Descending order of names ]");
		printArrayListToConsole(names);
	}

	private static void printArrayListToConsole(List<String> names) {
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("");
	}
}
