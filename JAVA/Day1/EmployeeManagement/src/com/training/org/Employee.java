package com.training.org;

public class Employee {
	
	private int empId;
	private String empName;
	private double salary;
		
	public Employee() {
		System.out.println("Deafult cons. of emp is called");
		this.empId=0;
		this.empName="";
		this.salary=0;
		
	}
	
	public Employee(int empId, String empName, double salary) {
		System.out.println("parameterized cons. called");
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	
	public String toString() {
		return "Employee details are "+this.empId+"  and name "+ this.empName+" and salary "+this.salary;
	}
	
	
	
	
	

}
