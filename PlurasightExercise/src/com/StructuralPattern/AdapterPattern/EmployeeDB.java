package com.StructuralPattern.AdapterPattern;

public class EmployeeDB implements Employee {

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	
	public EmployeeDB(int id, String firstName, String lastName, String email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

}
