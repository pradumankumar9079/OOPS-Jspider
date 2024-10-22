package com.jspider.day28array2;

import java.util.Scanner;

// WAP to display how many strong number is present in Array
// Strong Number: sum of factorial of each digit is number itself
//eg: 145=1+20+125=145

public class CountHowManyStrongInArray3 {
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

		// find count of strong Number
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (isStrong(a[i])) {
				count++;
			}
		}
		System.out.println("Count of Strong Number is: " + count);
	}

	private static boolean isStrong(int n) {
		int originalNumber = n;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + fact(rem);
			n = n / 10;
		}
		return sum == originalNumber;
	}

	private static int fact(int rem) {
		int fact = 1;
		for (int i = 2; i <= rem; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
