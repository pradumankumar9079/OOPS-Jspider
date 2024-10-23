package com.jspider.day28array2;

import java.util.Scanner;

// Print Smallest in user entered Array Element
public class SmallestAmongUserEnteredArray1 {
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

		// Analyze Small
		// Assuming Zero'th index value is smallest and than start comparing from first
		int small = a[0];
		for (int i = 1; i < size; i++) {
			if (small > a[i])
				small = a[i];
		}
		System.out.println("Smallest Number in array is: " + small);

	}
}
//Enter Size: 
//5
//Enter 5 array elements: 
//23 34 341 32335 1
//Smallest Number in array is: 1
