package com.jspider.day19;

import java.util.Scanner;

public class PrintNPrimePractice {
	// 3
	// 2 3 5
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
				System.out.print(i + ",");
				cnt++;
			}
			if (cnt == n)
				break;
			i++;
		}
	}
}
