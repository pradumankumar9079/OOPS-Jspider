package com.jspider.day31array5;

// Print Missing Element in Array
public class PrintMissingElementInArray3 {
	public static void main(String[] args) {
		int[] a = { 2, 3, 7, 8, 3 };

		int big = a[0], small = a[0];
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] < big) {
				big = a[i];
			}
			if (a[i] > small) {
				small = a[i];
			}
		}

		// small->1 big->10 1 to 10
		for (int i = small; i <= big; i++) {
			if (isMissing(i, a)) {
				System.out.println(i);
			}
		}

	}

	private static boolean isMissing(int n, int[] a) {
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] == n) {
				return false;
			}
		}
		return true;
	}
}
