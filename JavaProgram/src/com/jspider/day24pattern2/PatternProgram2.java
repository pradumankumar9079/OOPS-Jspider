package com.jspider.day24pattern2;

/*
    1
   21
  321
 4321
54321
*/
public class PatternProgram2 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// starting from i and decreasing till 1
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
