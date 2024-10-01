package com.jspider.day19;

import java.util.Scanner;

public class NearestPrime {
	static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	static void nearestPrimeNumber(int n) {
		/*---------------------Mine------------------------------*/
		// it will work but do with while but in some case like for 10
		// it will print 7 that's not nearest 11 is nearest
//		int nearest = 0;
//		for (int i = 2; i <= n; i++) {
//			if (isPrime(i) == true) {
//				nearest = i;
//			}
//		}
//		System.out.println("Nearest Prime Number is " + nearest);
		/*---------------------------------------------------*/

		/*--------------------Sir-------------------------------*/
		int p = n - 1; // Previous Value
		int n1 = n + 1; // Next Value
		while (true) {
			boolean rs = isPrime(n);
			if (rs == true) {
				System.out.println(n);
				break;
			}

			// Giving Priority to previous that's why this condition first
			boolean rs1 = isPrime(p);
			if (rs1 == true) {
				System.out.println(p);
				break;
			}

			boolean rs2 = isPrime(n1);
			if (rs2 == true) {
				System.out.println(n1);
				break;
			}

			p--;
			n1++;
		}
		/*---------------------------------------------------*/

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = scn.nextInt();

		nearestPrimeNumber(n);
	}
}
