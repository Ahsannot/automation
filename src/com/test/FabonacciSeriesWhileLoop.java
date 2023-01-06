package com.test;

import java.util.Scanner;

public class FabonacciSeriesWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Number :");
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int a = 0;
		int b = 1;
		int next ;
		int count = 2;
		System.out.print("Fabonacci numbers are:" +a+ " " +b);
		while (count<n) {
			next = a + b ;
			System.out.print(" " +next);
			count++;
			a = b;
			b = next;
			
		}
	}

}
