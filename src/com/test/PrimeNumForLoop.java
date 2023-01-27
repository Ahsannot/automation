package com.test;

import java.util.Scanner;

public class PrimeNumForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number :");
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int count = 0;
		if (n > 1) {
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					System.out.println("Rem is :" + n % i);
					count++;
					System.out.println(count);
				}
				else
				{
					System.out.println("Rem is :" + n % i);
				}
			}
			if (count == 2) {
				System.out.println(n + " is a Perfect number :");

			} else {
				System.out.println(n + " is not a Perfect number :");
			}
		} else {
			System.out.println(n + " is not a valid number :");
		}
	}
}
