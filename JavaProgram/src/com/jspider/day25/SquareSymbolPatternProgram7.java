package com.jspider.day25;

import java.util.Scanner;

/*
Enter Number: 
5
*   * * * 
*   *     
* * * * * 
    *   *  
* * *   * 
*/
// Me
// Use mid as Variable recommended
public class SquareSymbolPatternProgram7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();

		int mid = n / 2 + 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 && j >= mid || j == 1 && i <= mid || i == mid || j == mid || j == n && i >= mid
						|| i == n && j <= mid) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
