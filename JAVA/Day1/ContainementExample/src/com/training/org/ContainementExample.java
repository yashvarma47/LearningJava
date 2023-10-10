package com.training.org;

import java.util.Arrays;

class Employee{
	private int empId;
	private String empName;
	private double salary;
	
	public Employee() {
		System.out.println("Default constructor of Employee is called");
		this.empId=0;
		this.empName="";
		this.salary=0;
	}
	
	public Employee(int empId,String empName,double salary) {
		System.out.println("Parameterised constructor of Employee is called");
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	
	public String toString() {
		return "EmpId "+this.empId+" Name "+this.empName+" Salary "+this.salary;
	}
	
}


class Oraganization{
	private String orgName;
	private String orgLocation;
	
	private Employee emp[];
	
	public Oraganization() {
		System.out.println("Default constructor of Organization is called");
		this.orgName="";
		this.orgLocation="";
		this.emp=new Employee[0];
	}
	
	
	public Oraganization(String orgName,String orgLocation,int size) {
		System.out.println("Parameterised constructor of Organization is called");
		this.orgName=orgName;
		this.orgLocation=orgLocation;
		this.emp=new Employee[size];
	}
	
	public Oraganization(String orgName,String orgLocation,Employee []empList) {
		System.out.println("Parameterised constructor of Organization is called");
		this.orgName=orgName;
		this.orgLocation=orgLocation;
		this.emp=empList;
	}
	
	public String toString() {
		
		
		return Arrays.toString(emp)+" OrgName "+this.orgName+" OrgLocation"+this.orgLocation;
	}
	
}



public class ContainementExample {

	public static void main(String[] args) {
		
//		Oraganization mav=new Oraganization("Maveric","Pune",101,"Eshan",100000);
//		System.out.println(mav);
		
		Employee empList[]=new Employee[5];
		empList[0]=new Employee(101,"Eshan",10000);
		empList[1]=new Employee(102,"Priya",20000);
		empList[2]=new Employee(103,"Anand",30000);
		empList[3]=new Employee(104,"Manish",40000);
		empList[4]=new Employee(105,"Tanish",50000);
		
		
		Oraganization org1=new Oraganization("MYOrg","pune",empList);
		System.out.println(org1);
		
		
//		Oraganization org1=new Oraganization("MYOrg","pune",5);
		
		
	
	}
}






