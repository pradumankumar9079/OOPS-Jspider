package com.jspider.day14;

import java.util.Scanner;

// Sum of digit's of it's square is equal to that number
//eg: 9==9*9=81=8+1=9
public class NeonNumber {
	static boolean isNeon(int n) {
		int originalNumber = n;
		int square = n * n;
		int sum = 0;
		while (square > 0) {
			int rem = square % 10;
			sum += rem;
			square /= 10;
		}
		return sum == originalNumber;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();

		if (isNeon(n))
			System.out.println(n + " is Neon Number");
		else
			System.out.println(n + " is not Neon Number");
	}
}
