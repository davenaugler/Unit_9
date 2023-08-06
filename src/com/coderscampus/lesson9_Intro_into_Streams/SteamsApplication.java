package com.coderscampus.lesson9_Intro_into_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SteamsApplication {

	public static void main(String[] args) {
		// Learned about Lambdas first because lambdas are used inside of Streams.
		
		
		List<String> names = new ArrayList<>();
//		Stream<String> streamsFromList() = names.stream();

		populateNames(names);

		// Old way of outputting similar data as a stream would do
//		for (String name : names) {
//			System.out.println(name);
//		}

		// Example of a stream with lambda. 
		// This Lambda version is to verbose
//		names.stream().forEach((String name) -> {
//			System.out.println(name);
//		});
		
		// Don't need to specify the data type, 'String'
		// When there is only 1 parameter you don't need the the brackets
		// When there is only one line of code in the lambda,
		// you don't need define a body
		// This way the names are in order as they were inserted into the list
//		names.stream().forEach(name -> System.out.println(name));
		
		// Multi-threading streams
		// This will not output the names in order as they were inserted into the list
		// ParallelStreams allows you to have a fast output, where everything is done at once
		// and it is considered an asynchronous operation
		names.parallelStream().forEach(name -> System.out.println(name));

	}

	// What are streams?
	// Streams allow you to perform various aggregate, filter, map, and reduce
	// operations on data elements in a concise and declarative manner.
	// They promote a more functional programming style, making your code more
	// expressive and easier to read and maintain.

	// Streams are not data structures; instead, they are a way to interact
	// with data in a collection (like lists, sets, or arrays) and perform
	// operations on that data in a sequence of steps.

	private static void populateNames(List<String> names) {
		names.add("Zander Zones");
		names.add("Emma Thompson");
		names.add("Benjamin Carter");
		names.add("Olivia Mitchell");
		names.add("Lucas Anderson");
		names.add("Ava Williams");
		names.add("Ethan Roberts");
		names.add("Sophia Brooks");
		names.add("Jackson Davis");
		names.add("Isabella Johnson");
		names.add("Liam Martinez");
		names.add("Allison Aundrey");

	}

}
