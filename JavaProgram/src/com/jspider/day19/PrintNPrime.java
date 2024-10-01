package com.jspider.day19;

import java.util.Scanner;

//WAP to print n prime iber
public class PrintNPrime {
	static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	/*------------------------------------------------------------*/
	// n>0 n-- while loop not work or give less result
	// n>0 n-- while loop will work if i am decreasing n-- inside loop
	/*------------------------------------------------------------*/

	static void printPrime(int n) {

		/*-------------------------My Logic------------------------------*/
//		int cnt = 0;
//		int i = 2;
//		while (cnt < n) {// We are checking n value if it's less than count stop iteration
//			if (isPrime(i) == true) {
//				System.out.print(i + " ");
//				cnt++;
//			}
//			i++;
//		}
		/*------------------------------------------------------------*/

		/*---------------------------Sir Logic---------------------------*/
		// More Optimize
		int cnt = 0;
		int i = 2;
		while (true) {
			boolean res = isPrime(i);
			if (res == true) {
				System.out.print(i + " ");
				cnt++;
			}
			if (cnt == n)
				break;
			i++;
		}
		/*------------------------------------------------------------*/
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Count: ");
		int n = scn.nextInt();

		PrintNPrime.printPrime(n);
	}
}
