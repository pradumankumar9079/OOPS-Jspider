package com.jspider.hasarelationship;

class A {
	void disp() {
		System.out.println("Class A");
	}
}

class B extends A {
	@Override
	void disp() {
		System.out.println("Class B");
	}

	A a = new A();
}

public class MainClass1 {
	public static void main(String[] args) {
		B b = new B();
		b.disp();
	}
}