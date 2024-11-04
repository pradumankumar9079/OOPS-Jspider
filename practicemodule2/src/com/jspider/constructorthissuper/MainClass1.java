package com.jspider.constructorthissuper;

class A {
	int a;
	static int a1;

	A() {
		this("Raja");
		a = 20;
		a1 = 30;
		System.out.println(a);
		System.out.println(a1);
	}

	A(String name) {
//		this();
		System.out.println("This is Raja raj");
	}
}

class B extends A {
	int b;

	B() {
		super("Raja");
		b = 40;
		System.out.println(b);
	}
}

public class MainClass1 {
	public static void main(String[] args) {
		A ref1 = new A("Raja");
		System.out.println(ref1 instanceof B);

		B ref = new B();
	}
}
