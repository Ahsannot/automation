package com.test;

import java.util.Scanner;

public class CountEvenOddDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Number :");
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int rem = 0;
		int even = 0;
		int odd = 0;
		while (num > 0) {
		     rem = num % 10;
		     if (rem % 2 == 0) {
				even++;
			}
		     else {
		    	 odd++;
		     }
		     num = num / 10;
		}
		System.out.println("Even Count is :" + even);
		System.out.println("Odd Count is :" + odd);
	}

}
