package com.test;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number :");
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		// Square Pattern
		System.out.println("Square Pattern");

		for (int i = 1, p = 1; i <= n; i++,p++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(p + " ");
			}
			System.out.println();
		}

		// Increasing Pattern
		System.out.println("Increasing Pattern");

		for (int i = 1, p = 1; i <= n; i++,p++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(p + " ");
			}
			System.out.println();
		}

		// Decreasing Pattern
		System.out.println("Decreasing Pattern");

		for (int i = 1, p = 1; i <= n; i++,p++) {
			for (int j = i; j <= n; j++) {
				System.out.print(p + " ");
			}
			System.out.println();
		}
		// Increasing-Decreasing Pattern
		System.out.println("Increasing-Decreasing Pattern");

		for (int i = 1, p = 5; i <= n; i++ , p--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print(p+" ");
			}
			System.out.println();
		}

		// Increasing-Decreasing*Decreasing Pattern
		System.out.println("Increasing-Decreasing*Decreasing Pattern");

		for (int i = 1, p = 0; i <= n; i++, p +=2) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print(p + " ");
			}
			for (int j = i; j < n; j++) {
				System.out.print(p + " ");
			}
			System.out.println();
		}

		// Decreasing-Increasing Pattern
		System.out.println("Decreasing-Increasing Pattern");

		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				if (i%2==0) {
					System.out.print("# ");	
				}
				else {
					System.out.print("$ ");
				}
			}
			System.out.println();
		}
		// Decreasing-Increasing*Increasing Pattern
		System.out.println("Decreasing-Increasing*Increasing Pattern");

		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j < i; j++) {
				if (i%2==0) {
					System.out.print("A ");	
				}
				else {
					System.out.print("B ");
				}
			}
			for (int j = 1; j <= i; j++) {
				if (i%2==0) {
					System.out.print("A ");	
				}
				else {
					System.out.print("B ");
				}
			}
			System.out.println();
		}
		// Diamond Pattern
		System.out.println("Diamond Pattern");
        int Q = 1;
		for (int i = 1; i < n; i++, Q++) {
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(Q+" ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print(Q+" ");
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++, Q++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print(Q+" ");
			}
			for (int j = i; j < n; j++) {
				System.out.print(Q+" ");
			}
			System.out.println();
		}
		// Left Increasing-Decreasing Pattern
		System.out.println("Increasing Pattern");

		for (int i = 1; i < n; i++) {
			int L = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(L++ +" ");
			}
			System.out.println();
		}

		for (int i = 1; i <= n; i++) {
			int p = 1;
			for (int j = i; j <= n; j++) {
				System.out.print(p++ +" ");
			}
			System.out.println();
		}

		// Right Increasing-Decreasing Pattern
		System.out.println("Right Increasing-Decreasing Pattern");

		for (int i = 1; i < n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			int p = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(p++ +" ");
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			int p = 1;
			for (int j = i; j <= n; j++) {
				System.out.print(p++ +" ");
			}
			System.out.println();
		}

		// Butter Fly Pattern
		System.out.println("Butter Fly Pattern");

		for (int i = 1; i <n; i++) {
			int p = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(p++ +" ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(p-- +" ");
			}
			System.out.println();
		}

		for (int i = 1, k = n; i <= n; i++, k--) {
			int p = k;
			int Q1 = k;
			for (int j = i; j <= n; j++) {
				System.out.print(p-- +" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print(Q1-- +" ");
			}
			System.out.println();
		}
		
		// Inverse Butter Fly Pattern
		System.out.println("Inverse Butter Fly Pattern");

		for (int i = 1; i <n; i++) {
			int p = 5;
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j < n; j++) {
				System.out.print(p-- +" ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print(p++ +" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			System.out.println();
		}

		for (int i = 1; i <= n; i++) {
			int p = 1;
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print(p++ +" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(p-- +" ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			System.out.println();
		}
		
		// Double Hill Pattern
		System.out.println("Double Hill Pattern");
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print(" *");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print(" *");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
