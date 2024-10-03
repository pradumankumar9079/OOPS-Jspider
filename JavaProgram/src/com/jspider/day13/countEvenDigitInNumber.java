package com.jspider.day13;

import java.util.Scanner;

public class countEvenDigitInNumber {
	static void countEvenDigit(int n) {
		int cnt = 0;
		while (n > 0) {
			int rem = n % 10;
			if (rem % 2 == 0)
				cnt++;
			n /= 10;
		}
		System.out.println(cnt);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();

		countEvenDigit(n);
	}
}
