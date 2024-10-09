package com.jspider.methodoverloading;

class Script {
	void test(int a) {
		System.out.println("Ad-Hoc Testing");
	}

	void test(double d) {
		System.out.println("Smoke Testing");
	}

	void test(String s) {
		System.out.println("Regression Testing");
	}
}

public class TestingTypeExampleDifferInput4 {
	public static void main(String[] args) {
		Script s = new Script();
		s.test(343);
		s.test(345.324);
		s.test("name");
	}
}
