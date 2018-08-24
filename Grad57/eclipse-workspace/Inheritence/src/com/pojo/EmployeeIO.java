package com.pojo;

public interface EmployeeIO {
	double pi=3.14;
	public static final String NAME= "CITY";
	
	Employee readEmployee();
	abstract public void writeEmployee(Employee employee);
	
	
}
