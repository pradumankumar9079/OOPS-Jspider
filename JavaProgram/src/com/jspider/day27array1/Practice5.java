package com.jspider.day27array1;

import java.util.Scanner;

// Taking User Input in array
public class Practice5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		// Taking Size from User
		int size = sc.nextInt();

		// Creating Array
		int[] a = new int[size];

		// Taking User Input
		System.out.println("Enter " + size + " number of Element");
		for (int i = 0; i <= size - 1; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Entered Element are: ");
		// Printing Array Element
		for (int i = 0; i <= size - 1; i++) {
			System.out.print(a[i] + " ");
		}

	}
}
//Enter Size: 
//4
//Enter 4 number of Element
//2 4 5 7
//Entered Element are: 
//2 4 5 7 
