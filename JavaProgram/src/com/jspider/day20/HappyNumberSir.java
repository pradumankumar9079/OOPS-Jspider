package com.jspider.day20;

import java.util.Scanner;

//Happy Number(Sum of Square of Each Digit Until getting Single Digit that digit should equal to 1 or 7) Eg: 97
public class HappyNumberSir {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();

		boolean res = isHappy(n);
		// instead of res==true write res directly if it's true it will execute
//		or use isHappy(n) Directly
		if (res) {
			System.out.println(n + " is Happy Number");
		} else {
			System.out.println(n + " is Not Happy Number");
		}
	}

	static boolean isHappy(int n) {
		while (n > 9) {
			int sum = 0;
			int rem = 0;
			while (n > 0) {
				rem = n % 10;
				int square = rem * rem;
				sum += square;
				n /= 10;
			}
			n = sum;

		}

		// Written 4 statement Replace with 1 it will also work
//		if (n == 1 || n == 7) {
//			return true;
//		}
//		return false;

		return n == 1 || n == 7;
	}
}
