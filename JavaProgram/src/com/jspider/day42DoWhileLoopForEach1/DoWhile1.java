package com.jspider.day42DoWhileLoopForEach1;

// WAP To Print Even Number Between 1 to 20 Using Do While
// While Loop is Entry Control Loop 
// do While Loop is Exit Control Loop

public class DoWhile1 {
	public static void main(String[] args) {
		// irrespective of condition it will run atleast once
		/************************ Working *******************/
//		do {
//			System.out.println("This is Raja raj");
//		} while (5 > 10);
		// This is Raja raj
		/*****************************************************/

		/*************** Solution My Way ************************/
		// Using one Var
//		int num = 1;
//		do {
//			if (num % 2 == 0) {
//				System.out.print(num + " ");
//			}
//			num++;
//		} while (num <= 20);
		/*****************************************/

		/***************** Solution Sir Way *******************/
//		Using Two Var
		int i = 1, n = 20;
		do {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		} while (i <= n);
		/*************************************************/
	}
}
//2 4 6 8 10 12 14 16 18 20 