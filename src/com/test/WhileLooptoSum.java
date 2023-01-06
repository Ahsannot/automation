package com.test;

import java.util.Scanner;

public class WhileLooptoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter number to find Sum :");
		Scanner scanner = new Scanner(System.in);
		
//		int number = scanner.nextInt();
//		int n = 1;
//		int sum = 0;
//		while (n<=number) {
//			System.out.println(n);
//			sum = sum+n;
//			n++;
//			
//			
//		}
//		System.out.println("Sum of the Entered number is: "+ sum);
//		
//		System.out.println("----------------------------------------");
		
		int integer = scanner.nextInt();
		int Value = integer ;
		int r ;
		int sums = 0;
		while (integer > 0) {
			
			r = integer % 10;
			System.out.println("Reminder is "+r);
			if (r == 0) {
				sums = sums + integer;
			}
			else {
				sums = sums + r;
				integer = integer/10;
				System.out.println("integer is "+integer);
			}
		}
		
		System.out.println("The sum of the Digits are :"+ Value+" = " + sums);
		
	}

}
