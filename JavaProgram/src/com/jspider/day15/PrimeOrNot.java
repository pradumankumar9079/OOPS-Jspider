package com.jspider.day15;

import java.util.Scanner;

// Using For Loop
public class PrimeOrNot {
	static boolean isPrime(int n) {
		if(n<=1)return false;
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

		boolean prime = isPrime(n);
		if (prime)
			System.out.println(n + " is Prime");
		else
			System.out.println(n + " is not Prime");
	}
}
