package com.jspider.polymorphismcompiletime;

class TestScript {
	void test(int a) {
		System.out.println("Ad-Hoc Testing");
	}

	void test(double d) {
		System.out.println("Sanity Testing");
	}

	void test(String s) {
		System.out.println("Regression Testing");
	}

	void test() {

	}
}

public class TestExMainClass4 {
	public static void main(String[] args) {
		TestScript ts = new TestScript();
		ts.test(45);
		ts.test(45456.5);
		ts.test("test");
		ts.test();
	}
}
