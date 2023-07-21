package com.coderscampus.lesson3;

import java.util.LinkedList;
import java.util.List;

public class LinkedListApp {

	public static void main(String[] args) {
		
		// Linked Lists have 4 Properties:
		// [1] - Next
		// [2] - Previous
		// [3] - Head (boolean flag, for, "Are we at the head/start of the list?"
		// [4] - Tail (boolean flag, for, "Are we at the tail/end of the list?"
		
		// Linked List Example 
		// Head=1      Head=0      Head=0      Head=0
		// Tail=0  <-> Tail=0  <-> Tail=0  <-> Tail=1
		//  (10)        (20)        (30)        (40)
		
		// When you need to remove a lot of stuff constantly, you should use a Linked List
		
		// Numbers Linked List
		List<Integer> numbers = new LinkedList<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		printListToConsole(numbers);
		
		numbers.remove(0);
		printListToConsole(numbers);
		
		// When referencing the object you must use CASTING prior to the Object (number) you type in 
		numbers.remove((Integer)30);
		printListToConsole(numbers);
		
		// Names Linked List
		List<String> names = new LinkedList<>();
		names.add("Dave Naugler");
		names.add("Allie Naugler");
		names.add("Addison Naugler");
		names.add("Elon Musk");
		names.add("John Doe");
		printListNamesToConsole(names);
		
		names.remove(4);
		printListNamesToConsole(names);
		
		names.remove(3);
		printListNamesToConsole(names);

	}
	
	private static void printListNamesToConsole(List<String> names) {
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("");
	}
	
	private static void printListToConsole(List<Integer> numbers) {
		for (Integer number : numbers) {
			System.out.println(number);
		}
		System.out.println("");
	}

}
