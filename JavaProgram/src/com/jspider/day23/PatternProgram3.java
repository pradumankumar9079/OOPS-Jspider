package com.jspider.day23;

/*
1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 3 
4 4 4 4 4 
5 5 5 5 5
*/

public class PatternProgram3 {
	public static void main(String[] args) {
		int n = 5;
		// Loop in 1 to 5 or 5 to 1 is same 5 iteration
		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= 1; j--) {
				System.out.print(n - j + 1 + " ");
			}
			System.out.println();
		}
	}
}
