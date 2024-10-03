package com.jspider.day13;

import java.util.Scanner;

public class sumOfOddDigitInNumber {
	static void sumOfOddDigit(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			if (rem % 2 != 0) {
				sum += rem;
			}
			n /= 10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();

		sumOfOddDigit(n);
	}
}
