package com.test;

import java.util.Scanner;

public class SizeBySwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number to find the Size :");
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();

		switch (number) {
		 case 30 : System.out.println("Size is Ideal" + number); 
		 break;
		 
		 case 40 : System.out.println("Size is Extra Large" + number); 
		 break;
		 
		 case 36 : System.out.println("Size is Large" + number); 
		 break;
		 
		 default: System.out.println("Invalid Number :" + number);
		 
		}
	}

}
