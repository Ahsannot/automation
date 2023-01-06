package com.test;

import java.util.Scanner;

public class ReverseNumberPalindromeWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Number :");
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int n = 0;
		int rev = 0;
		int digit = 0;
		n = num;
		// run loop until number becomes 0

		while (num > 0) {
			// get last digit from number

			digit = num % 10;
			rev = (rev * 10) + digit;
			// remove the last digit from number
			num /= 10;
		}
		System.out.println("Reversed Number: " + rev);
		
		if (n == rev) {
			System.out.println( n + " The entered number is palindrome. ");
		}
		else {
			System.out.println( n + " The entered number is not a palindrome. ");
		}
	}

}
