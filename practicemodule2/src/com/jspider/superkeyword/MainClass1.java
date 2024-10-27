package com.jspider.superkeyword;

class A {
	int a = 20;

	void disp() {
		System.out.println("Class A");
	}
}

class B extends A {
	int a = 30;

// super keyword is use to access non static member of super class
	// super
	// super keyword can only be written inside a non static context
	// like eg: method,IIB(Instance initialization block) constructor
	@Override
	void disp() {
		System.out.println(a);
		System.out.println(super.a);
		System.out.println("Class B");
	}
}

public class MainClass1 {
	public static void main(String[] args) {
		B ref = new B();
		ref.disp();

		A ref1 = new B();
		ref1.disp();// for method after upcasting latest implementation
		System.out.println(ref1.a);// 20 but not any rule for this
	}
}
