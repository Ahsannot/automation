package com.test;

import java.util.Scanner;

public class BillUsingIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Units Here:");

		Scanner sc = new Scanner(System.in);
		int units = sc.nextInt();
		int bill;
		if(units>500) {
			bill = units*7;
		}
		else if(units>300) {
			bill = units*5;
		}
		else {
			bill = units*2;
		}
		bill = bill + 150;
		if(bill>2000) {
			bill = bill + (bill*5/100);
		}
		System.out.println("Total Bill is :" + bill);
	}

}
