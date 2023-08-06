package com.coderscampus.lesson10_Stream_Map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapApplication {
	
	// Maps take an object and grabs one of the properties and allow you to do something with it

	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("Kia", "Telluride", "EX X-Line", "Glacial White Pearl", 2024));
		cars.add(new Car("Honda", "Civic", "Type R", "Boost Blue Pearl", 2023));
		cars.add(new Car("Honda", "Civic", "Type R", "Sonic Gray Pearl", 2023));
		cars.add(new Car("Honda", "Civic", "Type R", "Championship White", 2023));
		cars.add(new Car("Toyota", "Corolla", "GR", "Heavy Metal", 2023));
		cars.add(new Car("Mazda", "3", "i Touring", "Blue", 2012));
		cars.add(new Car("Kia", "Sportage", "LX", "Blue", 2018));
		cars.add(new Car("Hyundai", "Elantra", "N", "Cyber Gray", 2023));
		
		// Assigned the variable name 'models' here because we are getting the Model of the cars
		//   and it returns a String.
		
		// getModel of Cars using List
		System.out.println("MODEL");
		List<String> models = cars.stream()
		                          .map(car -> car.getModel())
		                          .collect(Collectors.toList());
		
		models.stream()
		      .forEach(model -> System.out.println(model));
		System.out.println("-----");
		
		
		// getBrand of Cars using Set
		// Outputs the car Brand names as a string in the order they were received w/o duplicates, vertically
		System.out.println("BRAND");
		
		Set<String> brands = cars.stream()
								 .map(car -> car.getBrand())
								 .collect(Collectors.toSet());
		
		brands.stream()
		      .forEach(brand -> System.out.println(brand));
		System.out.println("-----");
		
		
		// getTrim of Cars using String
		// Outputs the car trim names as a string in the order they were received w/o duplicates, horizontally
		System.out.println("TRIM");
					
		String trims = cars.stream()
			  			   .map(car -> car.getTrim())
			  			   .distinct()
			  			   .collect(Collectors.joining(", "));
			  				 
				System.out.println(trims);
				System.out.println("-----");
				
				
				
		// getBrands of Cars using String
		// Outputs the car brand names as a string in the order they were received w/o duplicates, horizontally,
		// and filtering out car names that do not start with H.
		System.out.println("BRANDS AGAIN");
				
		// Layer 1 - Start with the FULL list of cars
		String brandsAgain = cars.stream()
								 // Layer 2 - Narrow down to just the string 'brand'
					  	         .map(car -> car.getBrand())
					  	         // Layer 3 - Remove all duplicates
					  	         .distinct()
					  	         // Layer 4 - Filter in only the brands that start with "H"
					  	         .filter(brand -> brand.startsWith("H"))
					  	         // Layer 5 - Collect that together in one string joining with a comma and a space
					  	         .collect(Collectors.joining(", "));
					  				 
						System.out.println(brandsAgain);
						System.out.println("-----");
						
						
		System.out.println("BRANDS AGAIN: LONG WAY");			
		// The long way of coding out the above "BRANDS AGAIN" w/o using stream
		Set<String> carBrands = new HashSet<>();
		for (Car car : cars) {
			String brand = car.getBrand();
			if (brand.startsWith("H")) {
				carBrands.add(brand);
			}
		}
		String output = "";
		for (String carBrand : carBrands) {
			output += carBrand + ", ";
		}
		output = output.substring(0, output.length()-2);
		System.out.println(output);
		
				
	}

}
