package com.jspider.day27array1;

import java.util.Arrays;
import java.util.Scanner;

public class TakingUserInputInArray5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size = sc.nextInt();
		int a[] = new int[size];

		// Taking User Input
		// Telling User How many Element u have to Enter
		// rather than taking one by one input from user we will use for loop
		System.out.println("Enter " + size + " Array Element: ");

		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		// printing Array Element or use Arrays.toString(pass array)
//		System.out.println("Entered Elements are: ");
//		for (int i = 0; i < size; i++) {
//			System.out.print(a[i] + " ");
//		}
		System.out.println(Arrays.toString(a));
	}
}

//Enter Size: 
//5
//Enter 5 Array Element: 
//4 5 5 6 7
//Entered Elements are: 
//4 5 5 6 7 
