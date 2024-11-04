package com.jspider.inheritance;

class a1 {
	void funcA1() {
		System.out.println("a1");
	}
}

class a2 extends a1 {
	void funcA2() {
		System.out.println("a2");
	}
}

class a3 extends a1 {
	void funcA3() {
		System.out.println("a3");
	}
}

public class MainClass3 {
	public static void main(String[] args) {
		a1 a1 = new a1();
		a1.funcA1();

		a2 a2 = new a2();
		a2.funcA1();
		a2.funcA2();

		a3 a3 = new a3();
		a3.funcA1();
		a3.funcA3();
	}

}
