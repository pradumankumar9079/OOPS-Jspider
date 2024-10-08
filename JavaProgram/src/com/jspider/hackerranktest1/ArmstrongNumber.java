package com.jspider.hackerranktest1;

import java.util.Scanner;

//sum of each digit raise to power count of digit
//eg: 153
public class ArmstrongNumber {
	static int count(int n) {
		int cnt = 0;
		while (n > 0) {
			int rem = n % 10;
			cnt++;
			n = n / 10;
		}
		return cnt;
	}

	static void isArmstrong(int n) {
		int originalNumber = n;
		int cnt = count(n);
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + (int) Math.pow(rem, cnt);
			n = n / 10;
		}
		if (originalNumber == sum) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int n = sc.nextInt();

		isArmstrong(n);
	}
}
