package com.test;

import java.util.Scanner;

public class calculatorUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Value: ");
		
		int a = sc.nextInt();
		
		System.out.print("Enter 2nd Value: ");
		int b = sc.nextInt();
		int result = 0;
		System.out.print("Enter Operator: ");
		char ch = sc.next().charAt(0);
		switch(ch) {
		case '+':
			result=a+b;
			System.out.println("Sum of A and B is :" +result);
			break;
		case '-':
			result=a-b;
			System.out.println("Differentiate of A and B is :" +result);
			break;
		case '*':
			result=a*b;
			System.out.println("Multiplication of A and B is :" +result);
			break;
		case '/':
			result=a/b;
			System.out.println("Division of A and B is :" +result);
			break;
		case '%':
			result=a%b;
			System.out.println("Modulus of A and B is :" +result);
			break;
		default:
			System.out.println("You have enter a wrong character: ");
		}

	}

}
