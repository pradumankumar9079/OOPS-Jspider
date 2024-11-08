package com.jspider.exceptionhandling;

//try catch Romeo juliete
//one try one catch

public class MainClass1 {
	public static void main(String[] args) {
		System.out.println("Programs Start");
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println("\\By Zero");
		}
		System.out.println("Programs End");
	}
}
