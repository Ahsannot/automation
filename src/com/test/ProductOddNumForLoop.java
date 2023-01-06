package com.test;

import java.util.Scanner;

public class ProductOddNumForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Number :");
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int product = 1;
		
		for (int c = 1; c <= num; c=c+2) {
			product = product*c;
			
		}
		System.out.println("Product of odd num is :" + product);
	}

}
