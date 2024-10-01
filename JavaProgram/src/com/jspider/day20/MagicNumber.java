package com.jspider.day20;

import java.util.Scanner;

// Magic Number(Sum of Digit Until Getting Single Digit that digit should equal to 1) Eg: 1234
public class MagicNumber {
	static int sumOfDigit(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum += rem;
			n /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();

		int sum = n;
		while (sum > 9) {
			sum = sumOfDigit(sum);
		}
		if (sum == 1)
			System.out.println(n + " is Magic Number");
		else
			System.out.println(n + " Not Magic Number");
	}
}
