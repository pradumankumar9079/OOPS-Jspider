package com.jspider.day27array1;

import java.util.Arrays;
import java.util.Scanner;

public class ReplcaceIndexValWithSumOfDigits4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();

		// Creating Array
		int a[] = new int[size];

		// Taking User Input
		System.out.println("Enter " + size + " Array Elements: ");
		for (int i = 0; i < size; i++) {

			a[i] = sc.nextInt();
		}

		// After Replacing with sumOfDigits
		for (int i = 0; i < size; i++) {
			a[i] = sumOfDigits(a[i]);
		}

		// print after making changes using toString
		System.out.println(Arrays.toString(a));
	}

	private static int sumOfDigits(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum += rem;
			n /= 10;
		}

		return sum;
	}
}
//Enter size: 
//4
//Enter 4 Array Elements: 
//5767768 6 87 567 5454554
//[46, 6, 15, 18]

/*****************************************************************/
//Copy of Value (Primitives): Java copies the actual value of the variable. Changes inside the method don’t affect the original variable.
//Copy of Reference (Objects): Java copies the reference to the object, not the object itself. Modifications to the object's content affect the original object, but reassigning the reference inside the method doesn’t affect the original reference.
//This behavior is sometimes referred to as "pass-by-value of the reference" for objects
/****************************************************************/

/****************************************************************/
//Strings Are Passed by Value (Copy of Reference): Java passes a copy of the reference to the String.
//Immutability: Since String objects are immutable, any modification creates a new String object. The original String object cannot be changed.
//Reassignment of String Reference: Reassigning the String inside the method only changes the local reference, not the original reference outside the method.
/*****************************************************************/