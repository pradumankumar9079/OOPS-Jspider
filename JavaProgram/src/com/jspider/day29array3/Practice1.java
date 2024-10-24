package com.jspider.day29array3;

import java.util.Arrays;

// Bubble Sort
// pick one that's already sorted and than compare with rest
public class Practice1 {
	public static void main(String[] args) {
		int[] x = { 4, 3, 6, 2, 9 };

		/*********************************************/
//		// Using Built in method
//		Arrays.sort(x);
//		System.out.println(Arrays.toString(x));
		/*********************************************/

		for (int i = 0; i <= x.length - 1; i++) {
			for (int j = i + 1; j <= x.length - 1; j++) {
				if (x[i] > x[j]) {
					swap(x, i, j);
				}
			}
		}
		System.out.println(Arrays.toString(x));

	}

	public static void swap(int[] x, int i, int j) {
		int temp = x[i];
		x[i] = x[j];
		x[j] = temp;
	}
}
