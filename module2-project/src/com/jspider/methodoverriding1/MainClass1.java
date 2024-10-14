package com.jspider.methodoverriding1;

// Inheritance necessary
class Demo {
	void test() {
		System.out.println("Manual Testing");
	}
}

class Sample extends Demo {
	// Annotation --> it will tell to compiler and programmer what to do
	// Implementation of test or definition
	@Override
	void test() {
		System.out.println("Automation Testing");
	}
}

public class MainClass1 {

	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.test();

		Sample s1 = new Sample();
		s1.test();

		// After upcasting we will get latest implementation
		Demo ref = new Sample();
		ref.test();
	}
}
