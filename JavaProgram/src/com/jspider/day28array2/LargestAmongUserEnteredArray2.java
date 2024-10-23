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
		// Assuming Zero'th index element is biggest and than start comparing from index
		// 1
		int big = a[0];
		for (int i = 1; i < size; i++) {
			if (a[i] > big)
				big = a[i];
		}
		System.out.println("Largest Number in array is: " + big);

	}
}

//Enter Size: 
//5
//Enter 5 array elements: 
//56 47 2231 6653 23346
//Largest Number in array is: 23346
