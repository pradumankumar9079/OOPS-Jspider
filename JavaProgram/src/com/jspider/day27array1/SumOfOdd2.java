package com.jspider.day27array1;

// WAP To Print Sum of Odd Element
public class SumOfOdd2 {
	public static void main(String[] args) {
		int x[] = new int[4];
		x[0] = 5;
		x[1] = 8;
		x[2] = 9;
		x[3] = 16;

		int sum = 0;
		for (int i = 0; i < x.length - 1; i++) {
			if (x[i] % 2 != 0)
				sum += x[i];
		}
		System.out.println("Sum of Odd is: " + sum);
	}
}
//Sum of Odd is: 14
