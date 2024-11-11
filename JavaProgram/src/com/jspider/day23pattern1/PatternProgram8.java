package com.jspider.day23pattern1;

/*
  1  3  5  7  9
 11 13 15 17 19
 21 23 25 27 29
 31 33 35 37 39
 41 43 45 47 49
 
*/
public class PatternProgram8 {
	public static void main(String[] args) {
		int n = 5;
		int p = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
//				if (p < 10) {
//					System.out.print(p + "  ");
//				} else {
//					System.out.print(p + " ");
//				}

				System.out.printf("%3d", p);
				p = p + 2;
			}
			System.out.println();
		}
	}
}
