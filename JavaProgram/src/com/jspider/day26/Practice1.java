package com.jspider.day26;

class Practice1 {
	public static void main(String[] args) {
		// Triangle
		int n = 5;
		int sp = n / 2;
		int st = 1;
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= sp; k++) {
				System.out.print("  ");
			}

			for (int j = 1; j <= st; j++) {
				System.out.print("*" + " ");
			}

			if (i <= n / 2) {
				sp--;
				st = st + 2;
			} else {
				sp++;
				st = st - 2;
			}

			System.out.println();
		}
	}
}