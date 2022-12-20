package com.test;

import java.util.Scanner;

public class Find1stNumisMultof2ndIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 1st Number :");
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		System.out.println("Enter 2nd Number :");
		int b = sc.nextInt();

		if (a % b == 0) {
			System.out.println(" 1st Number is Multiple of 2nd ");
		}

		else {
			System.out.println("1st Number is not Multiple of 2nd ");
		}
	}

}
