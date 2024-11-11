package com.jspider.practice;

public class DiamondStarPatternProgram6 {
	public static void main(String[] args) {
		int n = 5;
		int sp = n / 2;
		int st = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= st; k++) {
				System.out.print("*" + " ");
			}
			if (i <= n / 2) {
				sp--;
				st += 2;
			} else {
				st -= 2;
				sp++;
			}
			System.out.println();
		}
	}
}
