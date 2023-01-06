package com.test;

import java.util.Scanner;

public class EvenSumOddSumWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number :");
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int es = 0;
		int os = 0;
		while (n>0) {
			if (n%2==0) {
				es = es+n ;
			}
			else {
				os = os + n;
			}
			n--;
		}
		System.out.println("Even sum is: " + es);
		System.out.println("Odd sum is: " + os);
	}

}
