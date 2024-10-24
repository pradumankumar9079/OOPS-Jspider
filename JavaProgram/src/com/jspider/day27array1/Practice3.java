package com.jspider.day27array1;

//print all prime
public class Practice3 {
	public static void main(String[] args) {
		int[] x = { 2, 3, 5, 7, 9, 11, 6, 3, 1, -2, -9 };

		for (int i = 0; i <= x.length - 1; i++) {
			if (isPrime(x[i])) {
				System.out.print(x[i] + " ");
			}
		}
	}

	private static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
//2 3 5 7 11 3 