package com.training.org;
//created abstract class because it has unimplemented method show
abstract class ParentClass{
	public void displayParent() {
		System.out.println("the displayParent method from parentclass is called");
		
	}
	public abstract void show();
}
//created child class which is inherited from parent class to over ride show method
class Childclass extends ParentClass{
	@Override
	public void show() {
		System.out.println("show method from child class1 is called");
		
	}
}
//created child class 2 which is inherited from parent class to over ride show method
class Child2class extends ParentClass{
	@Override
	public void show() {
		System.out.println("show method from child class2 is called");		
	}
}

// Main class which is public and containing main method
public class AbstractClassExapmle {
	public static void main(String[] args) {
	ParentClass p1 = new Childclass();
	p1.displayParent();
	p1.show();
	
	p1=new Child2class();
	p1.displayParent();
	p1.show();
	
	}

}
