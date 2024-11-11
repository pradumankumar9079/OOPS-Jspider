package com.jspider.day23pattern1;

// for pattern program first draw basic structure than print

/*
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 
*/

// IMPORTANT--> REVISE
public class PatternProgram14 {
	public static void main(String[] args) {
		int n = 5;
//		int k = i;
		for (int i = 1; i <= n; i++) {
//			int k = i;
//			for (int j = 1; j <= i; j++) {
//				System.out.print(k + " ");
//				k--;
//			}

			// next way
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
//			k = i + 1;
			System.out.println();
		}
	}
}
