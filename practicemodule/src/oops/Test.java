package oops;

class A {
	int a = 20;

	void m1() {

	}

	A() {

	}
}

class B extends A {
//	int a = 30;
	int b;

	void m1() {

	}

	B() {

	}
}

public class Test {
	public static void main(String[] args) {
		B obj2 = new B();
		System.out.println(obj2.a);
	}
}
