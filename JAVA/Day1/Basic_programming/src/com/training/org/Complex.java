/**
 * 
 */
package com.training.org;


import java.io.IOException;

import javax.swing.JOptionPane;


public class Complex {
	private int real;
	private int imaginary;
	// default constructor
	public Complex() {
		System.out.println("Default constructor complex is called");
		real = 0;
		imaginary = 0;
	}
	
	//parameterized constructor
	public Complex(int real, int imaginary) {
		System.out.println("parameterized cons. called");
		this.real=real;
		this.imaginary=imaginary;		
	}
	
	
	public  void showComplexValues(){
		System.out.println("Complex values are "+ real +" imaginary "+ imaginary );
	}
	
	
	public void acceptComplexvalues() throws IOException {
//		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("enter value for real");
//		this.real = Integer.parseInt(input.readLine());
//		System.out.println("enter value for imag");
//		this.imaginary = Integer.parseInt(input.readLine());
//
//		
		
	
	//second method
//	Scanner input1 = new Scanner(System.in);
//	System.out.println("enter value for real");
//	
		
		//third method
//		this.real = Integer.parseInt(JOptionPane.showInputDialog("Enter 1st value"));
//		this.imaginary = Integer.parseInt(JOptionPane.showInputDialog("Enter 2nd value"));
//		JOptionPane.showMessageDialog(null, "Values are "+ this.real+" "+this.imaginary);
		
//		public String toString(){
//			
//			}
		}

	
		
	
	
	
	
	public static void main(String[] args) throws IOException {
		Complex c1 = new Complex();
//		System.out.println(c1);
		
		c1.acceptComplexvalues();
		c1.showComplexValues();
//		Complex c2 = new Complex(100,200);
//		c2.showComplexValues();
//		for( int i=0; i<10;i++) {
//			System.out.println("i "+ i);
//		}
	}

}
