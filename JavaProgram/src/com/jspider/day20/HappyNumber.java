package com.jspider.day20;

import java.util.Scanner;

// Happy Number(Sum of Square of Each Digit Until getting Single Digit that digit should equal to 1 or 7) Eg: 97
public class HappyNumber {

	static int sumOfSquareOfEachDigit(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			int square = rem * rem;
			sum += square;
			n /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();

		int sum = n;
		while (sum > 9) {
			sum = sumOfSquareOfEachDigit(sum);
		}
		if (sum == 1 || sum == 7) {
			System.out.println(n + " is Happy Number");
		} else {
			System.out.println(n + " is Not Happy Number");
		}
	}
}
