package com.jspider.day40array2d1;

// WAP To Print Prime Element in the Array
// Observe like this
/*//Column
{ { 10, 20, 30 },// Row 
  { 40, 50, 60 }, 
  { 70, 80, 90 } };
 */
public class WAPToPrintPrimeIn2DArray3 {
	public static void main(String[] args) {
		int arr[][] = { { 10, 2, 30 }, { 40, 5, 67 }, { 11, 80, 90 } };
		for (int i = 0; i <= arr.length - 1; i++) {
			// a[i] is 1D Array
			// a[i][j] is 1D Array Particular Element
			for (int j = 0; j <= arr[i].length - 1; j++) {
				if (isPrime(arr[i][j])) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
	}

	private static boolean isPrime(int n) {
		if (n <= 1)
			return false;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
//2 5 67 11 
