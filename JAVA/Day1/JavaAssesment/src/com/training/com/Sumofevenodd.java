package com.training.com;
import java.util.Scanner;
public class Sumofevenodd {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int number, i, evenSum = 0, oddSum = 0;
		sc = new Scanner(System.in);
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();
		for(i = 1; i <= number; i++)
		{
			if(i % 2 == 0)
			{
				evenSum = evenSum + i; 
			}
			else
			{
				oddSum = oddSum + i;
			}
		}
		System.out.println("The Sum of Even Numbers upto " + number + "  =  " + evenSum);
		System.out.println("The Sum of Odd Numbers upto " + number + "  =  " + oddSum);
	}
}
