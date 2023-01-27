package com.test;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Number :");
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int count = 0;
		while (num > 0) {
			
			// remove the last digit from number
			num /= 10;
			count++;
		}
		System.out.println("Number of Digits are : " + count);
	}

}
