package com.jspider.typecastingnonprimitive;

// Upcastinhg From C--> A 
// Two Ways 
// Indirect
// Direct
class A {
	void test() {
		System.out.println("test()....");
	}
}

class B extends A {
	void disp() {
		System.out.println("test()....");
	}
}

class C extends B {
	void play() {
		System.out.println("play()....");
	}
}

public class UpcastingMultipleClassProgram4 {

	public static void main(String[] args) {
		C c1 = new C();
		c1.test();
		c1.disp();
		c1.play();

		B b1 = c1;// C-->B
		b1.test();
		b1.disp();

		A a1 = b1; // B-->A
		a1.test();
		// a1.disp();// Not Possible only Access A or Up

		// or Do this one liner for C-->A
		A a2 = new C();

	}
}
