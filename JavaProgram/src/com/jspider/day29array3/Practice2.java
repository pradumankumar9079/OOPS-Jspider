package com.jspider.day29array3;

import java.util.Arrays;

public class Practice2 {
	public static void main(String[] args) {
		int[] x = { 6, 2, 7, 9 };
		for (int i = 0; i <= x.length - 1; i++) {
			for (int j = i + 1; j <= x.length - 1; j++) {
				if (x[i] > x[j]) {
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(x));
	}
}
//[2, 6, 7, 9]
