package com.test;

import java.util.Scanner;

public class membershipUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Months :");
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		
		System.out.println("Enter Choice :");
		int c = sc.nextInt();
		int charges;
		switch(c) {
		case 1:
			charges = m*50;
			System.out.println("Total Charges are : "+ charges);
			break;
		case 2:
			charges = m*20;
			System.out.println("Total Charges are : "+ charges);
			break;
		case 3:
			charges = m*30;
			System.out.println("Total Charges are : "+ charges);
			break;
		default:
			System.out.println("Enter a Valid Choice : ");

		}

	}

}
