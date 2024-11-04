package com.jspider.hasarelationship;

class A {
	int a = 20;

	void disp() {
		System.out.println("Class A");
	}
}

class B {
	void disp() {
		System.out.println("Class B");
	}

	A a = new A();
}

public class MainClass1 {
	public static void main(String[] args) {
		B b = new B();
		b.disp();
		b.a.disp();

	}
}