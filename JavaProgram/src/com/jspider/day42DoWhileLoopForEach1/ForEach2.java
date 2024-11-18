package com.jspider.day42DoWhileLoopForEach1;

// Iterate Array Using for-each
// Eg:- For for-each Loop only for Collection and Arrays
// We Can't take condition Based Question Here

public class ForEach2 {
	public static void main(String[] args) {
		int[] x = { 10, 20, 30, 40 };
		for (int a : x) {
			System.out.print(a + " ");
		}
		System.out.println();

		/********************* Question ******************/
		// Sum of All the Array Element Using for Each

		int sum = 0;
		for (int a : x) {
			sum += a;
		}
		System.out.println("Sum is: " + sum);
		/*************************************************/
	}
}
//10 20 30 40 
//Sum is: 100
