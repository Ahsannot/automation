package com.test;

import java.util.Scanner;

public class findGradeUsingIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your Marks:");
		Scanner sc = new Scanner(System.in);
		
		int marks = sc.nextInt();
		if(marks >= 90) {
			System.out.println("Your Grade is A+");
		}
		else if(marks>=80) {
			System.out.println("Your Grade is A");
		}
		else if(marks>=40) {
			System.out.println("Your Grade is D");
		}
		else
		{
			System.out.println("Your Grade is F");
		}
	}

}
