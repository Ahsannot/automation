package com.test;

import java.util.Scanner;

public class ArmstrongNumberWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number :");
		Scanner scanner = new Scanner(System.in);

		int integer = scanner.nextInt();
		int n = integer;
		int r = 0;
		int sums = 0;
		while (n > 0) {

			r = n % 10;
			sums = sums + (r * r * r);
			System.out.println(sums);
			n = n / 10;
		}
		if (sums == integer) {
			System.out.println(integer + " is a Armstrom Number");
		}
		else
		{
			System.out.println(integer + " is not a Armstrom Number");
		}
	}
}
