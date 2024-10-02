package com.jspider.day20;

import java.util.Scanner;

// for magic number check n==1

public class SumOfDigitUntilSingleSir {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();

		sumOfEachDigit(n);
	}

	static void sumOfEachDigit(int n) {
		while (n > 9) {
			// Don't initialize sum outside loop because(Dry Run)
//			it will have old sum than and it will go in infinite loop
			int sum = 0;
			int rem = 0;

			while (n > 0) {
				rem = n % 10;
				sum += rem;
				n /= 10;
			}
			// i am assigning sum to n it will proceed for next
//			System.out.println(sum);
			n = sum;
		}
		System.out.println("Sum is " + n);

	}
}
