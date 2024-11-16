package com.jspider.day41array2d2;

// WAP To Find Sum of Both Diagonal Elements
// Separately

public class SumOfBothDiagonalElements1 {
	public static void main(String[] args) {
		int pds = 0;
		int sds = 0;

		int arr[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		// start from zero it's Array Not Pattern
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {

				// Middle Element Automatically get Skipped 2nd time or Condition don't use else
				// if instead use if

				if (i == j) {
//					System.out.print(arr[i][j] + " ");
					pds += arr[i][j];
				}
				if (i + j == arr.length - 1) {
					sds += arr[i][j];
				}
			}
//			System.out.println();
		}
		System.out.println("Sum Of Pds: " + pds);
		System.out.println("Sum Of Sds: " + sds);
	}
}
//Sum Of Pds: 150
//Sum Of Sds: 150
