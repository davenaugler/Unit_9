package com.coderscampus.M_Lesson13__GroupingDataWithStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import com.coderscampus.K_Lesson10__StreamMap_and_Lesson11__StreamJoining.Car;

public class GroupingDataWithStreamsApp {

	public static void main(String[] args) {
		
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("Kia", "Telluride", "EX X-Line", "Glacial White Pearl", 2024));
		cars.add(new Car("Kia", "Sportage", "LX", "Blue", 2018));
		cars.add(new Car("Honda", "Civic", "Type R", "Boost Blue Pearl", 2023));
		cars.add(new Car("Honda", "Civic", "Type R", "Sonic Gray Pearl", 2023));
		cars.add(new Car("Honda", "Civic", "Type R", "Championship White", 2023));
		cars.add(new Car("Toyota", "Corolla", "GR", "Heavy Metal", 2023));
		cars.add(new Car("Toyota", "GR Supra", "3.0 Premium", "Absolute Zero", 2024));
		cars.add(new Car("Mazda", "3", "i Touring", "Blue", 2012));
		cars.add(new Car("Hyundai", "Elantra", "N", "Cyber Gray", 2023));
		
		Map<String, List<Car>> groupedByBrand = cars.stream()
		    .collect(Collectors.groupingBy((car) -> car.getBrand()));
		System.out.println(groupedByBrand);
		
		
		
		
		// How to iterate through a hashmap using a stream
		// Set - a set is an interface that's a list that does not contain duplicates
		// Entry Object - key value interface [ interface Entry<K, V> ]
		
		System.out.println("--------");
//		Set of Entry objects<The key is a string, the value is a list of Cars>>>
//		
		Set<Entry<String, List<Car>>> entrySet = groupedByBrand.entrySet();
		
		System.out.println(entrySet);
		System.out.println("--------");
		
		entrySet.stream()
				.forEach((entry) -> {
					System.out.println(entry.getKey() + " -> " + entry.getValue());
					
					});

		
	}

}
