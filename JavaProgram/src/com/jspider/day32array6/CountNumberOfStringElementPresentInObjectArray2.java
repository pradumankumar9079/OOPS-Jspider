package com.jspider.day32array6;

// WAP too Print How many String Element Are Present in an Array
public class CountNumberOfStringElementPresentInObjectArray2 {
	public static void main(String[] args) {
		Object o[] = { 1, 2, 'c', "Raja", 1.2, false, "Riya", "Raj" };

		/****************** Mine *************************/
//		Number a[] = { 1, 2, 3, 1.2 };
//		if (a[i] instanceof Integer) {
//			System.out.println(a[i]);
//		}
//		/*******************************************/

		int cnt = 0;
		for (int i = 0; i <= o.length - 1; i++) {
			// Use Wrapper Class Don't Use Primitive after instanceof
			// String is not Wrapper class only primitive is having Wrapper class
			// Check Type Of Particular class or not
			if (o[i] instanceof String) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}

//3
