package com.jspider.day25pattern3;

/*
*********
 *******
  *****
   ***
    *
*/
public class StarPatternProgram1 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= i - 1; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
