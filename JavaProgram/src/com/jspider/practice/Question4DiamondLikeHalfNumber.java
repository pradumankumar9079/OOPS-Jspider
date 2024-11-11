package com.jspider.practice;

// My Way
public class Question4DiamondLikeHalfNumber {
	public static void main(String[] args) {
		int n = 7;
		int st = 1;
		for (int i = 1; i <= n; i++) {
			int p = 1;
			for (int j = 1; j <= st; j++) {
				System.out.print(p + " ");
				p++;
			}
			if (i <= n / 2) {
				st += 1;
//				p++;
			} else {
				st -= 1;
//				p--;
			}
			System.out.println();
		}
	}
}
