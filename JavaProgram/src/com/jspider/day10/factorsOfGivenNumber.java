package com.jspider.day10;

import java.util.Scanner;

public class factorsOfGivenNumber {
	// factor or divisor
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();

		// take n or n/2 and add n at the end
		// because after half only itself will devide it completely
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.print(n);
	}
}
