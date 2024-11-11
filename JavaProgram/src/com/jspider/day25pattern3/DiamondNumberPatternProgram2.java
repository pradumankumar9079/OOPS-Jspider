package com.jspider.day25pattern3;

import java.util.Scanner;

/*
Enter Number: 
7
      1 
    1 2 3 
  1 2 3 4 5 
1 2 3 4 5 6 7 
  1 2 3 4 5 
    1 2 3 
      1 
*/
public class DiamondNumberPatternProgram2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		int sp = n / 2, st = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			// int num=1;// or use Extra variable
			for (int k = 1; k <= st; k++) {
				System.out.print(k + " ");
				// num++;
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
