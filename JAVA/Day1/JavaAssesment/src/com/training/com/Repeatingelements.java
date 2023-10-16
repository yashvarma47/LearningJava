package com.training.com;

public class Repeatingelements {

	public static void main(String[] args) {
		int arr[]= {1,3,4,5,1};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int a = arr[i];
				int b = arr[j];
				if(a==b) {
					System.out.println("Repeated element is "+ a);
				}
			}
			break;
		}

	}

}
