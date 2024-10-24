package com.jspider.day27array1;

// WAP To Print Even Index Element
public class Practice1 {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5 };
		for (int i = 0; i <= arr.length - 1; i++) {
			if (i % 2 == 0)
				System.out.print(arr[i] + " ");
		}
	}
}
//2 4 
