package com.coderscampus.lesson7;

import com.coderscampus.lesson4.SetApplication;

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

	@Override
	public String toString() {
		return "Person [ssn=" + ssn + ", firstName=" + firstName + ", lastName=" + lastName + ", getSsn()=" + getSsn()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
