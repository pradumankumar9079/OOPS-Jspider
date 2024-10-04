package com.jspider.day15;

import java.util.Scanner;

// prime number is having only two factor
public class PrimeOrNotUsingFactor {
	static boolean isPrime(int n) {
		int cntFact = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				cntFact++;
		}
		return cntFact == 2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();

		boolean prime = isPrime(n);
		if (prime)
			System.out.println(n + " is Prime Number");
		else
			System.out.println(n + " is Not Prime Number");
	}
}
