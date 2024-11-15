package com.jspider.day40array2d1;

// Look At Note
public class MainClass1 {
	public static void main(String[] args) {
		// Initializer Approach
		int arr[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		System.out.println(arr[0][1]);
		System.out.println(arr[1][2]);
		System.out.println(arr.length);
		System.out.println(arr[1].length);
//		System.out.println(arr[1][3]);// AIBE
	}
}
//20
//60
//3
//3
