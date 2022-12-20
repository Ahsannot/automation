package com.test;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Data Types and Variables Initialization
		
		int a   = 10;
		float f = 5.2F;
		double d= 55.5;
		char c  = 'A';
		String s= "Ahsan";
		System.out.println(a+" "+f+" "+d+" "+c+" "+s);
		
		// Take Input From User
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a Number:");
		int n = scan.nextInt();
		
		System.out.println("You have entered:" + n);
		
		System.out.println("Please Enter a Double Number:");
		Double lg = scan.nextDouble();
		
		System.out.println("You have entered:" + lg);
		
		// Add three Numbers
		
		System.out.print("Please Enter 1st Number :");
		int n1 = scan.nextInt();
		
		System.out.print("Please Enter 2nd Number :");
		int n2 = scan.nextInt();
		
		System.out.print("Please Enter 3rd Number :");
		int n3 = scan.nextInt();
		
		int sum = n1+n2+n3;
		
		System.out.print("Sum of the Number are :"+sum);

	}

}
