package com.coderscampus.O_Lesson14__Streams_Recap;

import java.util.ArrayList;
import java.util.List;

import com.coderscampus.G_Lesson7__HashCode_and_Equals.Person;

public class StreamTutorial {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		populatePeopleDate(people);
		
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
