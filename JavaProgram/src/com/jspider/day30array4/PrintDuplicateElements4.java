package com.jspider.day30array4;

public class PrintDuplicateElements4 {

	// recommanded logic for finding frequency and
	// finding element which is having occurrence more than one's(Finding Duplicate)
	// we are keeping track of duplicate using boolean[]

	public static void main(String[] args) {
		int x[] = { 10, 20, 30, 20, -1 };

		boolean b[] = new boolean[x.length];

		for (int i = 0; i <= x.length - 1; i++) {
			int cnt = 1;
			if (b[i] == false) {
				for (int j = i + 1; j <= x.length - 1; j++) {
					if (x[i] == x[j]) {
						cnt++;
						b[j] = true;
					}
				}
				if (cnt > 1) {
					System.out.println(x[i] + "-" + cnt);
				}
			}
		}
	}
}
