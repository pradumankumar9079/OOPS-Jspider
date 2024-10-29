package com.jspider.day31array5;

import java.util.Arrays;

public class MergeTwoArrayInZigZagArray4 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		int b[] = { 5, 6, 7, 8 };

		int[] res = mergeInZigZag(a, b);
		System.out.println(Arrays.toString(res));
	}

	private static int[] mergeInZigZag(int[] a, int[] b) {
		int[] newArr = new int[a.length + b.length];
		if (a.length == b.length) {
			int k = 0;
			for (int i = 0; i <= a.length - 1; i++) {
				if (k % 2 == 0) {
					newArr[k] = a[i];
				}
				k++;
			}
			for (int i = 0; i <= b.length - 1; i++) {
				if (i % 2 != 0) {
					newArr[k] = b[i];
				}
				k++;
			}
		}
		return newArr;
	}
}
