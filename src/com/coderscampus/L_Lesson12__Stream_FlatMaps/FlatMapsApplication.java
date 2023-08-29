package com.coderscampus.L_Lesson12__Stream_FlatMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class FlatMapsApplication {

	public static void main(String[] args) {
		List<List<Integer>> listOfNumbersList = new ArrayList<>();
		listOfNumbersList.add(Arrays.asList(1, 2, 3));
		listOfNumbersList.add(Arrays.asList(4, 5, 6));
		listOfNumbersList.add(Arrays.asList(3, 2, 1));
		listOfNumbersList.add(Arrays.asList(9, 8, 7));
		listOfNumbersList.add(Arrays.asList(0, 3, 4));
		listOfNumbersList.add(Arrays.asList(12, 42, 78));
		listOfNumbersList.add(Arrays.asList(12, 90, 21));
		
		// Count - and using Integer of Stream to output the count of numbers inside 'listOfNumbersList'
		long integerCount = listOfNumbersList.stream()
		 				                     .flatMap(x -> x.stream())
						                     .count();
		System.out.println("The total number of numbers inside listOfNumbersList: " + integerCount);
		
		// Sum - and using IntStream to output the sum
		long sum = listOfNumbersList.stream()
									.flatMap(x -> x.stream())
									.mapToInt(x -> x.intValue())
									.sum();
		System.out.println("Sum of all the numbers in listOfNumbersLits is: " + sum);
		
		// Summary Statistics - and what it can output using IntStream
		IntSummaryStatistics sumStats = listOfNumbersList.stream()
									.flatMap(x -> x.stream())
									// Line 38 and 39 perform similar operations and line 38
									// seems to be more performant
									.mapToInt(Integer::intValue)
//									.mapToInt(x -> x.intValue())
									.summaryStatistics();
		System.out.println("Summary Statistics of all the numbers in listOfNumbersLits is: " + sumStats);
	}

}
