package com.jspider.day19;

import java.util.Scanner;

public class NearestPrimePractice {
	static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();

		// 7 10 11 print 11
		// 7 9 11 print 7
		int p = num - 1;
		int n = num + 1;

		while (true) {
			if (isPrime(num)) {
				System.out.println(num);
				break;
			}

			if (isPrime(p)) {
				System.out.println(p);
				break;
			}

			if (isPrime(n)) {
				System.out.println(n);
				break;
			}

			p--;
			n++;
		}

	}
}
