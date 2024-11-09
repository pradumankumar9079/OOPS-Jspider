package com.jspider.hackerranktest1;

public class Practice1 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			int sp = 2 * (n - i);
			for (int k = 1; k <= sp; k++) {
				System.out.print("  ");
			}
			for (int l = 1; l <= i; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
