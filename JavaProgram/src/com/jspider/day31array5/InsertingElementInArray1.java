package com.jspider.day31array5;

import java.util.Arrays;
import java.util.Scanner;

// WAP to insert user entered number at user enter specified index
public class InsertingElementInArray1 {
	public static void main(String[] args) {
		// Take User Input For Better
		int a[] = { 1, 2, 3, 4 };

		Scanner sc = new Scanner(System.in);

		// Asking User to Enter element
		System.out.println("Enter Element u wanna insert: ");
		int num = sc.nextInt();

		// Asking User to Enter Index
		System.out.println("Enter Index Position where u wanna insert Element: ");
		int index = sc.nextInt();

		// Creating a method it will perform insertion at User Enter Index
		int res[] = insert(a, num, index);

		if (res == null) {
			System.out.println("Enter Valid Index: ");
		} else {
			System.out.println(Arrays.toString(res));
		}

	}

	private static int[] insert(int[] a, int num, int index) {
		// Creating new Array in which we will insert old +new element
		int[] newArr = new int[a.length + 1];

		// handling counter case like if user will enter index more than old array size
		// we will return default value of object null and not perform insertion
		if (index < 0 || index > a.length)
			return null;

		// Assigning user enter element at user entered index
		newArr[index] = num;

		// now rest element we have to insert
		for (int i = 0; i <= a.length - 1; i++) {
			// until we are not hitting that index we have to insert normally
			// after that i+1 // although it will not increase real i value
			if (i < index) {
				newArr[i] = a[i];
			} else if (i >= index) {
				newArr[i + 1] = a[i];
			}
		}

		// returning new Array
		return newArr;
	}
}

//Enter Element u wanna insert: 
//45
//Enter Index Position where u wanna insert Element: 
//3
//[1, 2, 3, 45, 4]
