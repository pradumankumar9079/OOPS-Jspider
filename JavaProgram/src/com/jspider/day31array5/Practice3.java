package com.jspider.day31array5;

// find missing number in an array
public class Practice3 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 9, 8, 4 };

		int big = a[0], small = a[0];
		for (int i = 0; i <= a.length - 1; i++) {
			if (big < a[i])
				big = a[i];
			if (small > a[i])
				small = a[i];
		}

		for (int i = small; i <= big; i++) {
			if (isMissing(a, i)) {
				System.out.print(i + " ");
			}
		}
	}

	private static boolean isMissing(int[] a, int num) {
		for (int i = 0; i <= a.length - 1; i++) {
			if (num == a[i])
				return false;
		}
		return true;
	}
}
