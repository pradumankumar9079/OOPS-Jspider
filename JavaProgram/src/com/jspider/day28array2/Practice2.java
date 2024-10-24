package com.jspider.day28array2;

// print largest in user entered array Element
public class Practice2 {
	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 5, 56, 7 };

		int large = Integer.MIN_VALUE;
		// Assuming first Element is Largest
		for (int i = 0; i <= a.length - 1; i++) {
			if (large < a[i]) {
				large = a[i];
			}
		}
		System.out.println("Largest Element is: " + large);

	}
}
//Largest Element is: 56
