package com.jspider.day20;

import java.util.Scanner;

// Sum of Digit Until Getting Single Digit Eg: 2715
public class SumOfDigitTillSingle {
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
		System.out.println("Enter Number: ");
		int n = sc.nextInt();

//		int sum = Integer.MAX_VALUE;
		int sum = n;
		while (sum > 9) {
			sum = sumOfDigit(sum);
//			n = sum;
		}
		System.out.println("Sum is: " + sum);
	}
}
