package com.StructuralPattern.AdapterPattern;

import java.util.List;

public class AdapterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeClient client = new EmployeeClient();
		List<Employee> employeeList = client.getEmployeeList();
		
		System.out.println(employeeList);
	
	}

}
