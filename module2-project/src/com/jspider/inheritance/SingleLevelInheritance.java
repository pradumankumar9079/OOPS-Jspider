package com.jspider.inheritance;

// Single Level Inheritance
class A {
	void test() {
		System.out.println("Executing test()......");
	}
}

class B extends A { // A is Accessed By only one class here
	void disp() {
		System.out.println("Executing disp()......");
	}
}

public class SingleLevelInheritance {
	public static void main(String[] args) {
		A a1 = new A();
		a1.test();
		// a1.disp(); --> Not Possible

		B b1 = new B();
		b1.test();
		b1.disp();
	}
}
