package com.test;

import java.util.Scanner;

public class findMaxNumberUsingIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 1st Number :");
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number :");
		int b = sc.nextInt();
		
		System.out.println("Enter 3rd Number :");
		int c = sc.nextInt();
		if(a>b && a>c) {
			System.out.println("Maximum number is: " + a);
	}
		else if(b>a && b>c) {
			System.out.println("Maximum number is: " + b);
		}
		else {
			System.out.println("Maximum number is: " + c);
		}
}
}
		
		

