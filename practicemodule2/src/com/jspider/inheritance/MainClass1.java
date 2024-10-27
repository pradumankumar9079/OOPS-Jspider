package com.jspider.inheritance;

class A {
	int a = 10;

	void testa() {
		System.out.println("This is Class A");
	}
}

class B extends A {
	int b = 20;

	void testb() {
		System.out.println("This is Class B");
	}
}

class C extends A {
	int c = 30;

	void testc() {
		System.out.println("This is Class C");
	}
}

public class MainClass1 {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.a);
		a.testa();
		// a.testa(); not possible

		B b = new B();
		System.out.println(b.a);
		b.testa();
		System.out.println(b.b);
		b.testb();

		C c = new C();
		System.out.println(c.a);
		// System.out.println(c.b);// not possible
		// c.testb();//not possible
		c.testa();

		System.out.println(c.c);
		c.testc();
	}
}
