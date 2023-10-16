package com.training.com;

import java.util.Arrays;

public class Print2ndlargest {

	public static void main(String[] args) {
		int arr[] = {12, 35,1,10,34};
		int n = arr.length;
		int i;
		if(n<=2) {
			System.out.println("invalid input");	
			return ;
		}
		Arrays.sort(arr);
		for(i=n-2;i>=0;i--) {
			if(arr[i]!=arr[n-1]) {
				System.out.println("2nd largest element is "+ arr[i]);
				return ;
			}
		}
	}
}
