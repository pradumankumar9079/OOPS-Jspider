package com.jspider.day29array3;

import java.util.Arrays;

// Sort array in ascending order
public class SortArrayElementInAscendingOrder1 {
	public static void main(String[] args) {

		/************************************************************/
// Sort Element Using Built in method
//		int[] x = { 4, 2, 6, 1, 8 };
//		Arrays.sort(x);
//		System.out.println(Arrays.toString(x));
		/************************************************************/

		// No built method Please
		/************************************************************/
		int x[] = { 4, 2, 6, 1, 8 };

		// i is use to represent current element
		// j is use to comparision of remaining element with current element
		for (int i = 0; i <= x.length - 1; i++) {
			// why we comparing all element
			// because may be there is some element
			// which is smaller than our current element
			for (int j = i + 1; j <= x.length - 1; j++) {
				// Swap two numbers we can also use method for that
				if (x[i] > x[j]) {
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(x));
		/************************************************************/
	}
}
//[1, 2, 4, 6, 8]
