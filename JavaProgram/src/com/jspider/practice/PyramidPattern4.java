package com.jspider.practice;

public class PyramidPattern4 {
	public static void main(String[] args) {
		int n = 5;
//		int sp = n - 1, st = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("   ");
			}
			int p = 1;
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print((char) (p++ + 64) + "  ");
			}
			p = 1;
//			sp--;
//			st += 2;
			System.out.println();
		}
	}
}
