package com.test;

import java.util.Scanner;

public class CBSEBoardPercentageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Phy. Marks :");
		int phy = scan.nextInt();
		
		System.out.print("Enter Chemis. Marks :");
		int chemis = scan.nextInt();
		
		System.out.print("Enter Bio. Marks :");
		int bio = scan.nextInt();
		
		System.out.print("Enter Math Marks :");
		int math = scan.nextInt();
		
		System.out.print("Enter English Marks :");
		int eng = scan.nextInt();
		
		double sum = phy+chemis+bio+math+eng;
		
		System.out.println("Your Total Marks is :" + sum);
		
		double avg = (sum/5);
		System.out.println("Your Average Marks is :" + avg);
		
		double perc = 100*(sum/500);
		System.out.print("Your Percent Age of  Marks is :" +perc+"%");
		
	}

}
