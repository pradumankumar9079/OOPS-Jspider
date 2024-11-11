package com.jspider.day25pattern3;

import java.util.Scanner;

/*
Enter Number: 
7
      A 
    A B C 
  A B C D E 
A B C D E F G 
  A B C D E 
    A B C 
      A 
*/
public class DiamondCharacterPatternProgram6 {
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
				System.out.print((char) (k + 64) + " ");
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