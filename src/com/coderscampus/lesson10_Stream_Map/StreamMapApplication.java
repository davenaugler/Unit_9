package com.coderscampus.lesson10_Stream_Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapApplication {
	
	// Maps take an object and grabs one of the properties and allows you to do something with it

	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("Kia", "Telluride", "EX X-Line", "Glacial White Pearl", 2024));
		cars.add(new Car("Honda", "Civic", "Type R", "Boost Blue Pearl", 2023));
		cars.add(new Car("Honda", "Civic", "Type R", "Sonic Gray Pearl", 2023));
		cars.add(new Car("Honda", "Civic", "Type R", "Championship White", 2023));
		cars.add(new Car("Toyota", "Corolla", "GR", "Heavy Metal", 2023));
		cars.add(new Car("Mazda", "3", "i Touring", "Blue", 2012));
		cars.add(new Car("Kia", "Sportage", "LX", "Blue", 2018));
		
		// Assigned the variable name 'models' here because we are getting the Model of the cars
		//   and it returns a String.
		
		// getModel of Cars using List
		List<String> models = cars.stream()
		                          .map(car -> car.getModel())
		                          .collect(Collectors.toList());
		
		models.forEach(model -> System.out.println(model));
		
		System.out.println("-----");
		
		
		// getBrand of Cars using Set
		Set<String> brands = cars.stream()
								  .map(car -> car.getBrand())
								  .collect(Collectors.toSet());
		
		brands.forEach(brand -> System.out.println(brand));

	}

}
