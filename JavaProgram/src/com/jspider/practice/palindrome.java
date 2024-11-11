package com.jspider.practice;

import java.util.Scanner;

public class palindrome {
	static void isPalindrome(int n) {
		// reverse find
		int originalNumber = n;
		int rev = 0;
		while (n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		if (originalNumber == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();

		isPalindrome(n);
	}
}
