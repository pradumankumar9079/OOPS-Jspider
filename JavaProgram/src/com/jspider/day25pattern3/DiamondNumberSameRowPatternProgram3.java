package com.jspider.day25pattern3;

import java.util.Scanner;

/*
Enter Number: 
7
      1 
    2 2 2 
  3 3 3 3 3 
4 4 4 4 4 4 4 
  5 5 5 5 5 
    6 6 6 
      7 
*/
public class DiamondNumberSameRowPatternProgram3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		int sp = n / 2, st = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= st; k++) {
				System.out.print(i + " ");
			}
			if (i <= n / 2) {
				sp--;
				st = st + 2;
			} else {
				sp++;
				st = st - 2;
			}
			System.out.println();
		}
	}
}
