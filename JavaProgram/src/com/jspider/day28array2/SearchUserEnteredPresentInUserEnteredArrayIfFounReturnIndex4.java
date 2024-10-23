package com.jspider.day28array2;

import java.util.Scanner;

// WAP to find User Entered Number is Present inside user Entered Array or Not and if found return index or location
public class SearchUserEnteredPresentInUserEnteredArrayIfFounReturnIndex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size = sc.nextInt();

		System.out.println("Enter " + size + " array elements: ");
		int a[] = new int[size];

		// Taking User Input
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		// Take which Element user wanna search
		System.out.println("Enter Number u wanna Search for: ");
		int n = sc.nextInt();

		// Use Method for search
		int index = linearSearch(a, n);

		// Search in array print index
		if (index != -1) {
			System.out.println("Element " + n + " found at position: " + index);
		} else {
			System.out.println("Not Found");
		}

	}

	private static int linearSearch(int[] a, int n) {

		/*********************** My Way ****************************/
//		int index = -1;
//		for (int i = 0; i <= a.length - 1; i++) {
//			if (a[i] == n) {
//				index = i;
//				// don't use return use break instead after return nothing executes
//				break;
//			}
//		}
//		return index;
		/***************************************************/

		/******************* Sir Way Directly return ************/
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] == n) {
				return i;
			}
		}
		return -1;
		/***************************************************/
	}
}
//Enter Size: 
//4
//Enter 4 array elements: 
//2 3 4 5
//Enter Number u wanna Search for: 
//5
//Element 5 found at position: 3
