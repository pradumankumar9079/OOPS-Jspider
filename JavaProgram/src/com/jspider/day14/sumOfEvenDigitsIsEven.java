package com.jspider.day14;

import java.util.Scanner;

// Always True
public class sumOfEvenDigitsIsEven {
	static boolean evenDigitSumEven(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			if (rem % 2 == 0)
				sum += rem;
			n /= 2;
		}
		return sum % 2 == 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();

		boolean even = evenDigitSumEven(n);
		if (even)
			System.out.println("Is Even");
		else
			System.out.println("Is Odd");
	}
}
