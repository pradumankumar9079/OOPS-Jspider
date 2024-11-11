package com.jspider.day23pattern1;

/*
   1   2   3   4   5
   6   7   8   9  10
  11  12  13  14  15
  16  17  18  19  20
  21  22  23  24  25
  
*/
public class PatternProgram7 {
	public static void main(String[] args) {
		int n = 5;
		int p = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				// Don't Use this
//				if (p < 10) {
//					System.out.print(p + "  ");
//				} else {
//					System.out.print(p + " ");
//				}
				// Use This
//				in this 3 digit space it will print the value
				System.out.printf("%4d", p);
				p++;
			}
			System.out.println();
		}
	}
}
