package com.test;

import java.util.Scanner;

public class MinMaxDigitForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number for table :");
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int num = n;

		int max = n % 10, low = n % 10, rem;
		System.out.println("Max is  :" + max);
		System.out.println("Min is  :" + low);
		n = n / 10;
		System.out.println("N is  :" + n);
		for (int i = n; i >= 1; i = i / 10) {
			System.out.println("I is  :" + i);
			rem = i % 10;
			System.out.println("Rem is  :" + rem);
			if (rem > max) {
				max = rem;
			}
			if (rem < low) {
				low = rem;
			}
		}

		System.out.println("Max number is  :" + max);
		System.out.println("Min number is  :" + low);
	}

}
