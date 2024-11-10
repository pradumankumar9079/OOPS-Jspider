package com.jspider.abstraction;

abstract class A {
	abstract void m1();

	void m2() {

	}
}

class B extends A {
	@Override
	void m1() {
		System.out.println("Class B");
	}
}

public class MainClass1 {
	public static void main(String[] args) {
		A ref = new B();
		ref.m1();

	}
}
