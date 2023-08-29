package com.coderscampus.G_Lesson7__HashCode_and_Equals;

import java.util.Objects;

import com.coderscampus.D_Lesson4__Sets.SetApplication;

public class Person extends SetApplication {
	private Integer ssn;
	private String firstName;
	private String lastName;

	public Person(int ssn, String firstName, String lastName) {
		this.ssn = ssn;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Integer getSsn() {
		return ssn;
	}

	public void setSsn(Integer ssn) {
		this.ssn = ssn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// BEST PRACTICE
	// Typically best practice to @Override the toString, hashCode, and equals methods
	// You do that by automatically generate the overridden toString, hashCode, and equals methods
	
	// DIRECTIONS ON HOW TO GENERATE EQUALS AND HASHCODE (AND TOSTRING)
	// Right click, Source, Generate toString
	// Right click, Source, Generate hashCode and equals 
	
	// WHY GENERATE EQUALS AND HASHCODE?
	// The reason to @Override the equals and hashCode is for Java Objects, where you are going to be storing it inside of 
	// data structure. Because pretty much all data structures need to be able to do an 'equals' to determine if two objects 
	// are equal to each other or not. 
	// ALWAYS @Overriding equals and hashCode together. Do not do one and not the other.
	// If you do one and not the other, you'll find that there are times where two things are unique and other times
	// they won't be unique, even though they should be.


	@Override
	public String toString() {
		return "Person [ssn=" + ssn + ", firstName=" + firstName + ", lastName=" + lastName+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ssn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(ssn, other.ssn);
	}
	
	

	
	
	
	
	
	

}
