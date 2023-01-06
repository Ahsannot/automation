package com.test;

import java.util.Scanner;

public class TableForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number for table :");
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		
		System.out.print("Enter length for table :");
		int len = scanner.nextInt();
		
		for (int i = 1; i <=len; i++) {
			
			System.out.println(num +"*"+ i + " = " + num*i);
		}
	}

}
