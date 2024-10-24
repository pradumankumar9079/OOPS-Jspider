package com.jspider.day28array2;

// Smallest and Biggest Sum is Prime or not
public class Practice5 {
	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5, 64, 3, 46, 8, 9 };

		int small = a[0], big = a[0];
		for (int i = 1; i <= a.length - 1; i++) {
			if (small > a[i])
				small = a[i];
			if (big < a[i])
				big = a[i];
		}
		int sum = small + big;
		boolean flag = true;
		if (sum <= 1)
			flag = false;
		for (int i = 2; i <= sum / 2; i++) {
			if (sum % i == 0)
				flag = false;
		}
		if (flag) {
			System.out.println("is Prime");
		} else {
			System.out.println("is Not Prime");
		}

	}
}
//is Not Prime
