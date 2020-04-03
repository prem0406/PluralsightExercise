package com.StructuralPattern.AdapterPattern;

public class EmployeeAdapter implements Employee {
	private EmployeeADB instance;
	
	public EmployeeAdapter(EmployeeADB instance) {
		this.instance = instance;
	}
	
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return instance.getEid();
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return instance.getGivenName();
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return instance.getSurName();
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return instance.getMail();
	}

}
