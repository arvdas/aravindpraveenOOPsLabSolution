package com.greatlearning.model;

public class Employee {
	String firstName;
	String lastName;
	
	public String getFName() {
		return firstName;
	}
	
	public void setFName() {
		this.firstName=firstName;
	}
	public String getLName() {
		return lastName;
	}
	
	public void setLName() {
		this.lastName=lastName;
	}
	public Employee(String firstName,String lastName) {
		
	    this.firstName=firstName;
	    this.lastName=lastName;
	}
}

