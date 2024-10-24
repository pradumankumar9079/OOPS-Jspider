package com.jspider.day28array2;

import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];
		System.out.println("Enter " + size + " Number of Element");
		for (int i = 0; i <= a.length - 1; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Enter Element u wanne Search foe: ");
		int ele = sc.nextInt();

		int index = linearSearch(a, ele);
		if (index == -1)
			System.out.println("Not Found: ");
		else
			System.out.println("Element Found at index " + index);
	}

	private static int linearSearch(int[] a, int ele) {
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] == ele)
				return i;
		}
		return -1;
	}
}
//Enter Size of Array: 
//5
//Enter 5 Number of Element
//2 3 4 6 7
//Enter Element u wanne Search foe: 
//7
//Element Found at index 4
