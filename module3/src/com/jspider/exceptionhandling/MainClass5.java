package com.jspider.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

// Scanner Example
public class MainClass5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value");
		try {
			int val = sc.nextInt();
			System.out.println("Value: " + val);
		} catch (InputMismatchException e) {
			System.out.println("Invalid Input Enter");
		} finally {
			sc.close();
			System.out.println("Scanner Closed");
		}
	}
}
