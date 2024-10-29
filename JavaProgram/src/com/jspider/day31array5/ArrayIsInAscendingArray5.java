package com.jspider.day31array5;

// Check in Ascending order or not
public class ArrayIsInAscendingArray5 {
	public static void main(String[] args) {
		int a[] = { 1, 9, 3, 4, 5 };
		if (isAsc(a)) {
			System.out.println("In Ascending Order");
		} else {
			System.out.println("Not in Ascending Order");
		}
	}

	private static boolean isAsc(int[] a) {
		// checking if first element is greater than second element or not
		// if it's there than return false
		// come ot of loop return true
		// for int a[] = {1,2,3,4,5} if taking a.length-1 get
		// arraindexoutofboundexception
		for (int i = 0; i <= a.length - 2; i++) {
			if (a[i] > a[i + 1])
				return false;
		}
		return true;
	}
}
