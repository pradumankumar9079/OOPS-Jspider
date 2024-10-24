package com.jspider.day27array1;

// Replace index value with sum of it's Digit
public class Practice4 {
	public static void main(String[] args) {
		int[] x = { 2, 33, 7763, 67, 8, 9 };
		for (int i = 0; i <= x.length - 1; i++) {
			x[i] = sumOfDigit(x[i]);
			System.out.print(x[i] + " ");
		}

	}

	private static int sumOfDigit(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum += rem;
			n /= 10;
		}
		return sum;
	}
}
//2 6 23 13 8 9 
