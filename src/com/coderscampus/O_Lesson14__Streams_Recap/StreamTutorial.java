package com.coderscampus.O_Lesson14__Streams_Recap;

import java.util.ArrayList;
import java.util.List;

import com.coderscampus.G_Lesson7__HashCode_and_Equals.Person;

public class StreamTutorial {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		populatePeopleDate(people);
		
		System.out.println("");
		
		// NOT USING STREAMS
		// If we were not using Streams
		// The code below is how we'd code it out
		List<Person> intermediateList = new ArrayList<>(); // Create new List of 'Person' objects and set the variable name to 'intermediateList', aka 'intermediateList' will hold a list of 'Person' objects.
		for(Person person : people) { // For each iteration a single 'people', objects of type 'Person', is assigned to 'person' variable.
			if (person.getSsn() >= 10) { // if loop (like the filter in Streams). If person's SSN is greater than or equal to 10
				intermediateList.add(person); // Add that person to intermediateList
			}
		}
		
		for (Person person : intermediateList) { // Terminating option: For each iteration a single 'intermediateList', objects of type 'Person', is assigned to 'person' variable.
			System.out.println(person); // For each 'Person' object in 'intermediateList', Print the 'person' object to the console
		}
		
	
		
		
		System.out.println("");
		
		// USING STREAMS
		// Streams are just fancy for loops
		people.stream() // Stream of Lists of Person objects | Stream<List<Person>>
						// as many intermediate operations: Examples are filter, map, flatMap, distinct
			   .filter(person -> person.getSsn() >= 10)
			  
			  .forEach(System.out::println); // One terminating/terminal operations: Examples are forEach, Collect, Reduce 
	}

	private static void populatePeopleDate(List<Person> people) {
		for (int i = 0; i < 20; i++) {
			Person person = new Person(i, "John" + (i+1), "Doe" + (i+1));
			people.add(person);
			
		}
		
	}

}
