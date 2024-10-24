package com.jspider.day27array1;

import java.util.Arrays;
import java.util.Scanner;

public class ReplcaceIndexValWithSumOfDigits4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();

		// Creating Array
		int a[] = new int[size];

		// Taking User Input
		System.out.println("Enter " + size + " Array Elements: ");
		for (int i = 0; i < size; i++) {

			a[i] = sc.nextInt();
		}

		// After Replacing with sumOfDigits
		for (int i = 0; i < size; i++) {
			a[i] = sumOfDigits(a[i]);
		}

		// print after making changes using toString
		System.out.println(Arrays.toString(a));
	}

	private static int sumOfDigits(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum += rem;
			n /= 10;
		}

		return sum;
	}
}
//Enter size: 
//4
//Enter 4 Array Elements: 
//5767768 6 87 567 5454554
//[46, 6, 15, 18]
