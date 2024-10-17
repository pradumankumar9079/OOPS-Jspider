package com.jspider.day25;

import java.util.Scanner;

/*
Enter Number: 
7
      *       
      *       
      *       
* * * * * * * 
      *       
      *       
      *       
*/
// Trace -->Revise (i == n / 2 + 1 || j == n / 2 + 1)
public class SquarePartPatternProgram1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == n / 2 + 1 || j == n / 2 + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
