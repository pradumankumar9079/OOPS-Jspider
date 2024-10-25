package com.jspider.day30array4;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray1 {
	public static void main(String[] args) {
		// Using User Input
		// Creating First Array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size1 = sc.nextInt();
		int a[] = new int[size1];

		System.out.println("Enter " + size1 + " Number of Element");
		for (int i = 0; i <= size1 - 1; i++) {
			a[i] = sc.nextInt();
		}

		// Creating Second Array
		System.out.println("Enter Size: ");
		int size2 = sc.nextInt();
		int b[] = new int[size2];

		System.out.println("Enter " + size1 + " Number of Element");
		for (int i = 0; i <= size2 - 1; i++) {
			b[i] = sc.nextInt();
		}

		/*************************************************/
		// Hardcode
//		int a[] = { 1, 2, 3, 4 };
//		int b[] = { 5, 6, 7, 8 };
		/*************************************************/

		// Accepting that array and than printing it
		int res[] = merge(a, b);
		System.out.println(Arrays.toString(res));
	}

	// Return Arrays
	// Creating newArray to merge using method returning newArr
	private static int[] merge(int[] a, int[] b) {
		// after creating it's having default value as zero
		int sizeOfNewArr = a.length + b.length;
		int newArr[] = new int[sizeOfNewArr];

		// Reading Array a and than inserting into new Array
		// Use this
		int i;
		for (i = 0; i <= a.length - 1; i++) {
			newArr[i] = a[i];
		}

		// Reading Array b and than inserting into new Array
		for (int j = 0; j <= b.length - 1; j++) {
			// My Way
//			newArr[i++] = b[j];

			// Sir way
//			or we can use a.length as well to skip that
//			many number of element in new Array
			newArr[a.length + j] = b[j];

		}
		return newArr;
	}
}

//Enter Size: 
//3
//Enter 3 Number of Element
//3 5 6
//Enter Size: 
//5 
//Enter 3 Number of Element
//3 5 6 79 8 
//[3, 5, 6, 3, 5, 6, 79, 8]
