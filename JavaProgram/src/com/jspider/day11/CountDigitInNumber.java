package com.jspider.day11;

import java.util.Scanner;

public class CountDigitInNumber {
	static void countDigit(int n) {
		int cnt = 0;
		while (n > 0) {
			// int rem = n % 10;
			cnt++;
			n /= 10;
		}
		System.out.println(cnt);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();

		countDigit(n);
	}
}
