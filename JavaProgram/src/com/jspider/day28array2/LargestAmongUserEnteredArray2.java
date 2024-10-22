package com.jspider.day28array2;

import java.util.Scanner;

// Print Largest Among User Entered Array Element
public class LargestAmongUserEnteredArray2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size = sc.nextInt();

		System.out.println("Enter " + size + " array elements: ");
		int a[] = new int[size];

		// Taking User Input
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		// Analyze Large
		int large = a[0];
		for (int i = 1; i < size; i++) {
			if (a[i] > large)
				large = a[i];
		}
		System.out.println("Largest Number in array is: " + large);

	}
}
