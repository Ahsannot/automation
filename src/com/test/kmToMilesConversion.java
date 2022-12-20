package com.test;

import java.util.Scanner;

public class kmToMilesConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Kilometers Here :");
		double km = scan.nextDouble();
		
		double mile = km*0.621371;
		
		System.out.print("Total Mile are :" + mile);
		
	}

}
