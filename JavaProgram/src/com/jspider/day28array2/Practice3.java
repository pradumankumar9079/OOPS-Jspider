package com.jspider.day28array2;

// count how many strong in Array
//strong: factorial of sum of each digit is equal to number it'self
public class Practice3 {
	public static void main(String[] args) {
		int a[] = { 2, 3, 145, 345, 63 };

		int cnt = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			if (isStrong(a[i]))
				cnt++;
		}
		System.out.println("Count is: " + cnt);
	}

	private static boolean isStrong(int n) {
		int originalNumber = n;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum += factorial(rem);
			n /= 10;
		}
		return sum == originalNumber;
	}

	private static int factorial(int rem) {
		int fact = 1;
		for (int i = 2; i <= rem; i++)
			fact *= i;
		return fact;
	}
}
//Count is: 2
