package com.jspider.typecasting;

class A {
	int a = 20;

	void funcA() {
		System.out.println("Class A");
	}
}

class B extends A {
	int a = 30;

	@Override
	void funcA() {
		System.out.println("Class A Latest");
	}

	void funcB() {
		System.out.println("Class B");
	}
}

public class MainClass2 {
	public static void main(String[] args) {
		A ref1 = new A();
		System.out.println(ref1.a);
		ref1.funcA();

		B ref2 = new B();
		System.out.println(ref1.a);
		ref2.funcA();
		ref2.funcB();

		// UpCasting
		A refA = new B();
		refA.funcA();
		System.out.println(refA.a);

		// DownCasting
		B refB = (B) refA;
		System.out.println(refB.a);
		refB.funcA();
		refB.funcB();
	}
}
