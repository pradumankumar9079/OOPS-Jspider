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

		System.out.println("Enter Number u wanna Search for: ");
		int n = sc.nextInt();

		// Search in array print index
		int index = -1;
		for (int i = 0; i < size; i++) {
			if (a[i] == n) {
				index = i;
				// don't use return use break instead after return nothing executes
				break;
			}
		}
		if (index != -1) {
			System.out.println("Element " + n + " found at position: " + index);
		} else {
			System.out.println("Not Found");
		}

	}
}
