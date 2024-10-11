package com.jspider.day10Practice;

import java.util.Scanner;

//8
//1 2 4 8
public class FactorForGivenNumber {
	static void factorOfNum(int n) {
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		factorOfNum(n);
	}
}
