package com.jspider.day28array2;

import java.util.Scanner;

// WAP Print Sum of Smallest and Biggest is Prime or Not
public class InArraySmallestAndBiggestSumIsPrime5 {
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

		// don't take two loops
		int small = a[0], big = a[0];
		for (int i = 1; i < size; i++) {
			if (small > a[i]) {
				small = a[i];
			}
			// don't use (else if) it won't work
			// because will have to run for all element
			if (big < a[i]) {
				big = a[i];
			}
		}

		int sum = small + big;
		if (isPrimeSum(sum)) {
			System.out.println("Sum Prime");
		} else {
			System.out.println("Sum Not Prime");
		}
	}

	private static boolean isPrimeSum(int sum) {
		// include negative as well
		if (sum <= 1)
			return false;
		for (int i = 2; i <= sum / 2; i++) {
			if (sum % i == 0)
				return false;
		}
		return true;
	}

}

//	Enter Size: 
//		4
//		Enter 4 array elements: 
//		2
//		3
//		4
//		5
//		Sum Prime