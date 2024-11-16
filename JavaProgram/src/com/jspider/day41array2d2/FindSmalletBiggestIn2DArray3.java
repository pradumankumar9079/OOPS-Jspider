package com.jspider.day41array2d2;

// WAP To Find Biggest and Smallest in 2D Array
public class FindSmalletBiggestIn2DArray3 {
	public static void main(String[] args) {
		int arr[][] = { { 10, 2, 30 }, { 40, 5, 67 }, { 11, 80, 90 } };
		int small = arr[0][0], big = arr[0][0];
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				if (small > arr[i][j]) {
					small = arr[i][j];
				}
				if (big < arr[i][j]) {
					big = arr[i][j];
				}
//				System.out.print(arr[i][j] + " ");
			}
		}
		System.out.println("Smallest is: " + small);
		System.out.println("Biggest is: " + big);
	}
}
//Smallest is: 2
//Biggest is: 90
