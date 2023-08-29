package com.coderscampus.D_Lesson4__Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.coderscampus.G_Lesson7__HashCode_and_Equals.Person;

public class SetApplication {

	// [ Sets are like lists, except there are no duplicates ]
	// LinkedHashSet - Keeps order, does not allow duplicates
	// HashSet - Does not keep order, does not allow duplicates
	
	// NEW COMMENT
	
	public static void main(String[] args) {
//      Set<define data type stored in set> variableName = initializeObject LinkedHashSet<>();
// 	    Can not use Set, because it's an interface, you need to choose one of it's concrete
//      classes that implement that interface
		Set<Person> people = new HashSet<>();
		people.add(new Person(111111111, "Dave", "Naugler"));
		people.add(new Person(111111111, "Dave", "Naugler"));
		for (Person person : people) {
			System.out.println(person.toString());
		}
		
//		example1();
		
	}

	private static void example1() {
		Set<Integer> uniqueNumbers = new LinkedHashSet<>();
		
		System.out.println(uniqueNumbers.add(1)); // true, because it's not a duplicate
		System.out.println(uniqueNumbers.add(2)); // true, because it's not a duplicate
		System.out.println(uniqueNumbers.add(3)); // true, because it's not a duplicate
		System.out.println(uniqueNumbers.add(4)); // true, because it's not a duplicate
		System.out.println(uniqueNumbers.add(5)); // true, because it's not a duplicate
		System.out.println(uniqueNumbers.add(6)); // true, because it's not a duplicate
		System.out.println(uniqueNumbers.add(1)); // false, because it is a duplicate
		System.out.println(uniqueNumbers.add(2)); // false, because it is a duplicate
		System.out.println(uniqueNumbers.add(3)); // false, because it is a duplicate
		System.out.println(uniqueNumbers.add(7)); // true, because it's not a duplicate
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
