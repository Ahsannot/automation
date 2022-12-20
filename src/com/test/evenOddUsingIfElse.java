package com.test;

import java.util.Scanner;

public class evenOddUsingIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a Number:");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n%2==0){
			System.out.println(n+" is Even Number");
		}
		else {
			System.out.println(n+" is Odd Number");
		}
	}

}
