package com.test;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number :");
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int sum = 0;
		int rem = 0;
		while (n>0) {
			rem = n % 10 ;
			sum = sum + rem;
			n = n/10;
		}
		System.out.print("Sum of the Digits are :" + sum);
	}

}
