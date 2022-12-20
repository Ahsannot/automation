package com.test;

import java.util.Scanner;

public class SalaryUsingIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Salary :");
		Scanner sc = new Scanner(System.in);

		int salary = sc.nextInt();
		int net;
		if (salary >= 20000) {
			net = salary - (salary * 7 / 100);
			System.out.println("The Net Salary is : " + net);
		} else if (salary >= 10000) {
			net = salary - 1000;
			System.out.println("The Net Salary is : " + net);
		} else {
			net = salary;
			System.out.println("The Net Salary is : " + net);
		}
	}

}
