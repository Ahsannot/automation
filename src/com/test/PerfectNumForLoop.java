package com.test;

import java.util.Iterator;
import java.util.Scanner;

public class PerfectNumForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number for table :");
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int num = n;
		int sum =0;
		for (int i = 1; i <n; i++) {
			if (n%i==0) {
				sum = sum +i;
				System.out.print(sum);
			}
		}
		if (sum==num) {
			System.out.print(n+ " is a Perfect number :");

		} else {
			System.out.print(n+ " is not a Perfect number :");
		}
	} 

}
