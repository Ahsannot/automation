package com.test;

import java.util.Scanner;

public class ProductCompnentForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number :");
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int s = 1;
		for (int i = n; i >=s; i--) {
		//	System.out.println("I is : "+i);
			for (int j = 1; j <=n; j++) {
			//	System.out.println("J is : "+j);
				if (i*j == n) {
					System.out.println(i+" * "+j+"   = " +i*j);
					s = j + 1 ;
					System.out.println("S is : "+s);
				}
			}
			
		}
	}

}
