package com.jspider.constructors;

class Demo {
	Demo() {
		System.out.println("Demo() Constructor");
	}
}

class Sample extends Demo {
	Sample() {
		// Even Though not Writing Super()
		// it automatically written By Compiler(Means Programmer Failed to write)
		// OR Programmer Can Write at first Line
		super();
		System.out.println("Sample() Constructor");
	}
}

public class SuperOffExample1 {
	public static void main(String[] args) {
		Sample s = new Sample();
	}
}
