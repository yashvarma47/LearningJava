package com.training.org;

import java.util.Scanner;

public class Salary {
	Scanner sc = new Scanner(System.in);
		
	int sales = sc.nextInt();
	int salary = sc.nextInt();
	public void checksalary() {
		if (sales<5000) {
			salary=(int) (salary*0.05);
			System.out.println("enter the sales");

		}
	}

}
