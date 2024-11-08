package com.jspider.exceptionhandling;

// Without implement cloneable Exception Occur
// try catch Romeo juliete
// one try one catch
public class Square {
	int side;

	public static void main(String[] args) {
		System.out.println("Program Start");
		Square original = new Square();
		original.side = 5;
		try {
			Square copy = (Square) original.clone();
			System.out.println(copy.side);
		} catch (CloneNotSupportedException e) {
			System.out.println("Clone Operation Failed");
		}
		System.out.println("Program Ends");

	}
}

//Program Start
//Clone Operation Failed
//Program Ends
