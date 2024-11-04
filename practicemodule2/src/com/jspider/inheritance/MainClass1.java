package com.jspider.inheritance;

class A {
	void funcA() {
		System.out.println("A");
	}
}

class B extends A {
	void funcB() {
		System.out.println("B");
	}
}

public class MainClass1 {
	public static void main(String[] args) {
		A refA = new A();
		refA.funcA();

		B refB = new B();
		refB.funcA();
		refB.funcB();
	}
}
