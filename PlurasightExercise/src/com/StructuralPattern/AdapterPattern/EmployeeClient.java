package com.StructuralPattern.AdapterPattern;


import java.util.ArrayList;

public class EmployeeClient {
	
	public ArrayList<Employee> getEmployeeList() {
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		Employee employee = new EmployeeDB(123, "John", "Wick", "John@wick.com");
		employeeList.add(employee);
		
		EmployeeADB employeeADB = new EmployeeADB(124, "Steven", "Berg", "steven@berg.com");
		employeeList.add(new EmployeeAdapter(employeeADB));
		
		EmployeeCSV employeeCSV = new EmployeeCSV("223,Sherlock,Holmes,sherlock@holms.com");
		EmployeeCSVAdapter employeeCSVadapter = new EmployeeCSVAdapter(employeeCSV);
		employeeList.add(employeeCSVadapter);
		
		return employeeList;
	}
}
