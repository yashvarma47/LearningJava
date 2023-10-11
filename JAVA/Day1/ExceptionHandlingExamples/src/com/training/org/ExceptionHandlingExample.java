package com.training.org;
class MyException extends Exception{
	private String myMessage;
	public MyException() {
		System.out.println("Default constructor of MyException Class is called");
		myMessage="";
	}
	public MyException(String msg) {
		System.out.println("Parameterised constructor of MyException Class is called");
		myMessage=msg;
	}
	
	public String getMyMessage() {
		return this.myMessage;
	}
}

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		int a=0;
		try {
			if(a==0) {
				throw new MyException("This is my custom message");
			}
		}
		catch(MyException e) {
			System.out.println(e.getMyMessage());
		}
		 a=0;
		try {
			a=100/0;
			System.out.println("done");
		}
		catch (ArithmeticException e) {
			System.out.println("FOUND ERROR "+e.getMessage());
		}
		catch(Exception e) {
			System.out.println("ERROR "+e.getMessage());
		}
		finally {
			System.out.println("We are always with you ");
		}
		System.out.println("ENDED");
		System.out.println("Value of a"+a);

		
		
		
	}

}


