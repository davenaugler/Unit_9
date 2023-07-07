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
		
		
		List<Integer> numbers = new LinkedList<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		printListToConsole(numbers);
		
		numbers.remove(0);
		printListToConsole(numbers);
		
		numbers.remove((Integer)30);
		printListToConsole(numbers);


	}
	
	private static void printListToConsole(List<Integer> numbers) {
		for (Integer number : numbers) {
			System.out.println(number);
		}
		System.out.println("");
	}

}
