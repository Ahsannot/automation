package com.test;

import java.util.Scanner;

public class FactorialWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number to find Factorial :");
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int f = 1;
		int c = 1;
		while (c <= n) {
			f = f * c;
			System.out.println(f);
			c++;
		}
		System.out.println("Factorial of the Entered number is: " + f);
	}

}
