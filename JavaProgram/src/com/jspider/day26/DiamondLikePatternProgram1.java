package com.jspider.day26;

import java.util.Scanner;

/*
Enter Number: 
5
    * 
  *   * 
*       * 
  *   * 
    * 
*/public class DiamondLikePatternProgram1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();

		int sp = n / 2;
		int st = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= st; k++) {
				if (k == 1 || k == st) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			if (i <= n / 2) {
				sp--;
				st += 2;
			} else {
				sp++;
				st -= 2;
			}
			System.out.println();
		}

	}
}
