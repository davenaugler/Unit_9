package com.coderscampus.lesson8_Lambdas;

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
		
		// Sort in Acceding order
		Collections.sort(names);
		printArrayListToConsole(names);
		
		// Sort in Descending order
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		printArrayListToConsole(names);
				
		
	}
	
	private static void printArrayListToConsole(List<String> names) {
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("");
	}
}
