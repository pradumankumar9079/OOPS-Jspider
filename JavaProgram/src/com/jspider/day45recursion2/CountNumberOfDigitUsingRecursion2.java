package com.jspider.day45recursion2;

public class CountNumberOfDigitUsingRecursion2 {
	static int cnt = 0;

	public static void main(String[] args) {
		int n = 8765;
		count(n);
		System.out.println(cnt);
	}

	private static void count(int n) {
		if (n == 0) {
			return;
		} else {
			int rem = n % 10;
			cnt++;
			count(n / 10);
		}
	}
}
