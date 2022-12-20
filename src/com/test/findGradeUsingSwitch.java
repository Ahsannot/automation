package com.test;

import java.util.Scanner;

public class findGradeUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Your Grades Here:");
		Scanner sc = new Scanner(System.in);
		
		int grade = sc.nextInt();
		switch(grade) {
		case 90: 
			System.out.println("Excellent Grades:");
		    break;
		case 80: 
			System.out.println("Good Grades:");
		    break;
		case 40: 
			System.out.println("You are just pass:");
		    break;
		default:
			System.out.println("Invalid Number is Entered :");
	
		}
	}

}
