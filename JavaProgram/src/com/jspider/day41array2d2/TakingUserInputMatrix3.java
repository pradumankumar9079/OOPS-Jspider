package com.jspider.day41array2d2;

import java.util.Scanner;

// Taking User Input Matrix(try to take in other than matrix)
public class TakingUserInputMatrix3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nor rows");
		int row = sc.nextInt();

		System.out.println("Enter nor Col");
		int col = sc.nextInt();

		int a[][] = new int[row][col];

		System.out.println("enter " + (row * col) + " ele");

		// taking User Input
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j <= a[i].length - 1; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		// Printing it
		// Not Able to use to.string it won't work for 1d array
		System.out.println("============================");
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j <= a[i].length - 1; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
