package com.jspider.day28array2;

// print smallest in user entered array Element
public class Practice1 {
	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 5, 56, 7 };

		int small = Integer.MAX_VALUE;
		// Assuming first Element is Smallest
		for (int i = 0; i <= a.length - 1; i++) {
			if (small > a[i]) {
				small = a[i];
			}
		}
		System.out.println("Smallest Element is: " + small);

	}
}
//Smallest Element is: 2
