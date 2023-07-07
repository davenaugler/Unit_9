package com.coderscampus.lesson4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetApplication {

	// [ Sets are like lists, except there are no duplicates ]
	// LinkedHashSet - Keeps order, does not allow duplicates
	// HashSet - Does not keep order, does not allow duplicates
	
	public static void main(String[] args) {
		Set<Integer> uniqueNumbers = new LinkedHashSet<>();
		System.out.println(uniqueNumbers.add(1));
		System.out.println(uniqueNumbers.add(2));
		System.out.println(uniqueNumbers.add(3));
		System.out.println(uniqueNumbers.add(4));
		System.out.println(uniqueNumbers.add(5));
		System.out.println(uniqueNumbers.add(6));
		System.out.println(uniqueNumbers.add(1));
		System.out.println(uniqueNumbers.add(2));
		System.out.println(uniqueNumbers.add(3));
		printSetToConsole(uniqueNumbers);
		
		Set<String> uniqueNames = new HashSet<>(); 
		uniqueNames.add("Dave Naugler");
		uniqueNames.add("Allison Naugler");
		uniqueNames.add("Addison Naugler");
		uniqueNames.add("Trevor Page");
		uniqueNames.add("Elon Musk");
		uniqueNames.add("Addison Naugler");
		printNameSetToConsole(uniqueNames);
		
	}
	
	private static void printNameSetToConsole(Set<String> names) {
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("");
	}
	
	private static void printSetToConsole(Set<Integer> numbers) {
		for (Integer number : numbers) {
			System.out.println(number);
		}
		System.out.println("");
	}
}
