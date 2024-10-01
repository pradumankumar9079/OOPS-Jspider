package com.jspider.day19;

import java.util.Scanner;

public class NthPrimeNumber {
	static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	static void nthPrimeNumber(int n) {
		int cnt = 0;
		int i = 0;
		int nthPrime = 0;
		while (true) {
			boolean res = isPrime(i);
			if (res == true) {
				cnt++;

			}
			if (cnt == n) {
				nthPrime = i;// instead of doing this we can directly printNthPrimeNumber
				break;
			}
			i++;
		}
		System.out.println("Nth Prime Number is " + nthPrime);

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = scn.nextInt();

		nthPrimeNumber(n);
	}
}
