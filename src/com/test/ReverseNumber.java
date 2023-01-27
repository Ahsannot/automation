package com.test;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Number :");
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		
		int rev = 0;
		int digit = 0;
		// run loop until number becomes 0

		while (num > 0) {
			// get last digit from number

			digit = num % 10;
			System.out.println("Digit is: " + digit);
			
			rev = (rev * 10) + digit;
			System.out.println("Reverse is: " + rev);
			
			// remove the last digit from number
			num /= 10;
			
			System.out.println("Number is: " + num);
		}
		System.out.println("Reversed Number: " + rev);
	}

}
