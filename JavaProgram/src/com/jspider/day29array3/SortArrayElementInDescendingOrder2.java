package com.jspider.day29array3;

import java.util.Arrays;

// WAP To Sort Array Element in Descending Order
public class SortArrayElementInDescendingOrder2 {
	public static void main(String[] args) {
		int x[] = { 4, 2, 6, 1, 8 };

		// i is use to represent current element
		// j is use to comparision of remaining element with current element
		for (int i = 0; i <= x.length - 1; i++) {
			// why we comparing all element
			// because may be there is some element
			// which is greater than our current element
			for (int j = i + 1; j <= x.length - 1; j++) {
				// Swap two numbers we can also use method for that
				if (x[i] < x[j]) {
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(x));
	}
}
//[8, 6, 4, 2, 1]
