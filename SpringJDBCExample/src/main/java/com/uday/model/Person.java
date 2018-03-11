package com.uday.model;

public class Person {
	private int personId;
	private String firstName;
	private String lastName;
	private String email;
	
	public Person(int personId, String firstName, String lastName, String email) {
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
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
	
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person" + " " + "[" + this.personId + ", " + this.firstName + ", " + this.lastName + ", " + this.email + "]"; 
	}
	
}
