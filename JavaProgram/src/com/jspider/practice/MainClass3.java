package com.jspider.practice;

import java.util.Arrays;

public class MainClass3 {
	public static void main(String[] args) {
		int[] a = { 1, 2234, 34, 44, 5 };
		for (int i = 0; i <= a.length - 1; i++) {
			a[i] = sum(a[i]);
		}
		System.out.println(Arrays.toString(a));
	}

	private static int sum(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum += rem;
			n /= 10;
		}
		return sum;
	}
}
