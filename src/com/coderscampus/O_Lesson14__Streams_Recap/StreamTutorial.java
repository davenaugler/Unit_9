package com.coderscampus.O_Lesson14__Streams_Recap;

import java.util.ArrayList;
import java.util.List;

import com.coderscampus.G_Lesson7__HashCode_and_Equals.Person;

public class StreamTutorial {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		populatePeopleDate(people);
		
		people.stream()
			  .forEach(System.out::println);
	}

	private static void populatePeopleDate(List<Person> people) {
		for (int i = 0; i < 20; i++) {
			Person person = new Person(i, "John" + (i+1), "Doe" + (i+1));
			people.add(person);
			
		}
		
	}

}
