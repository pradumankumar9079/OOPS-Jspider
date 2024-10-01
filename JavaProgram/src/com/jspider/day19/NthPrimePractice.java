package com.jspider.day19;

import java.util.Scanner;

public class NthPrimePractice {
	// 3
	// 2 3 5 print 5
	static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();

		int i = 2;
		int cnt = 0;
		while (true) {
			if (isPrime(i)) {
				cnt++;
			}
			if (cnt == n) {
				System.out.println(i);
				break;
			}
			i++;
		}
	}
}
