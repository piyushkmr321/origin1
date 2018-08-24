package com.pojo;

public class Employee extends person {

	private double empSalary;
	private int empId;
	
	public Employee()
	{   super();
		empId=0;
		empSalary=1000;
	}
	
	public Employee(int empId, double empSalary,int age, String name)
	{   super(age,name);
		this.empId=empId;
		this.empSalary=empSalary;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	
	public void display()
	{
		System.out.println(empId+"\t" + empSalary);
		super.display();
		System.out.println(getAge());
		System.out.println("employee");
	}

	@Override
	public String toString() {
		return "Employee [empSalary=" + empSalary + ", empId=" + empId + "]";
	}
	
	
}
