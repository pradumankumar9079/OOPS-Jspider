package com.jspider.day27array1;

//sum of odd element
public class Practice2 {
	public static void main(String[] args) {
		int sum = 0;
		int[] x = { 2, 3, 45, 6, 67, 4 };
		for (int i = 0; i <= x.length - 1; i++) {
			if (x[i] % 2 == 0)
				sum += x[i];
		}
		System.out.println("Sum " + sum);

	}
}
//Sum 12
