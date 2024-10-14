package com.jspider.day24;

/*
*********
 *******
  *****
   ***
    *
*/
public class StarPatternProgram4 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= n - i; k++) {
				System.out.print("*");
			}
			for (int k = 1; k <= n - i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
