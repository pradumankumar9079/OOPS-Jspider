package com.jspider.practice;

public class MainClass2 {
	public static void main(String[] args) {
		int[] a = { 1, 145, 334, 434, 5 };
		int cnt = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			if (isStrong(a[i])) {
				cnt++;
				System.out.print(a[i] + " ");
			}
		}
		System.out.println();
		System.out.println(cnt);
	}

	static boolean isStrong(int n) {
		int originalNumber = n;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			int fact = factorial(rem);
			sum = sum + fact;
			n = n / 10;
		}

		return originalNumber == sum;
	}

	static int factorial(int rem) {
		int fact = 1;
		for (int i = 2; i <= rem; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
