package com.test;

import java.util.Scanner;

public class swappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter value of A :");
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		
		System.out.print("Enter value of B :");
		int b = scanner.nextInt();
		
		/* Using 3rd variable 
		int t = b;
		b = a;
		a = t;
		
		a = a+b; Using two variables
		b = a-b ;
		a = a-b;
		*/
		
		a = a*b;
		b = a/b ;
		a = a/b;
		System.out.print("Value of A and B is :" + a +" "+ b);
	}

}
