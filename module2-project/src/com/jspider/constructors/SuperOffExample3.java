package com.jspider.constructors;

class Delta {
	Delta() {
		this(10);
		System.out.println("Delta() Constructor");
	}

	Delta(int a) {
		System.out.println("Delta(int) Constructor");
	}
}

class Example extends Delta {
	Example() {
		System.out.println("Example() Constructor");
	}

	Example(int a) {
		// super(10);// if not written
//		it will call Default Delta() one only not Delta(10)
		this();
		System.out.println("Example(int) Constructor");
	}

}

public class SuperOffExample3 {
	public static void main(String[] args) {
		Example ex = new Example(15);
	}
}
// Check It
//Delta(int) Constructor
//Delta() Constructor
//Example() Constructor
//Example(int) Constructor
