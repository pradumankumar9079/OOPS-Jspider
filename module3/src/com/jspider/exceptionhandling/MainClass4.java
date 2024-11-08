package com.jspider.exceptionhandling;

// Try Catch Finally 
public class MainClass4 {
	public static void main(String[] args) {
		try {
			System.out.println("Try Starts");
			System.out.println("10/0");
			System.out.println("Try Ends");
			// Always wanna Execute Briyani so in Finally
		} catch (ArithmeticException e) {
			System.out.println("/By Zero");
		} finally {
			System.out.println("Briyani");
		}
	}
}
//Try Starts
//10/0
//Try Ends
//Briyani
