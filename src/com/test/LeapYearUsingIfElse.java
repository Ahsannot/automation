package com.test;

import java.util.Scanner;

public class LeapYearUsingIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a Number:");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n % 4 == 0) {
			System.out.println(n + " is Leap Year");
		} else {
			System.out.println(n + " is not Leap Year");
		}
	}

}
