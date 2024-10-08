package com.jspider.day23;

/*

  1
  2  3
  4  5  6
  7  8  9 10
 11 12 13 14 15
 
*/
public class PatternProgram13 {
	public static void main(String[] args) {
		int n = 5;
		// in each row how many column ask to urself
		// here we are not printing same value in row or column as well
		// so it is not related to i or j take extra value
		int k = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
//				if (k < 10) {
//					System.out.print(k + "  ");
//				} else {
//					System.out.print(k + " ");
//				}
				System.out.printf("%3d", k);
				k++;
			}
			System.out.println();

		}
	}
}
