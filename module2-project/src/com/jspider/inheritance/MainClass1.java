package com.jspider.inheritance;

class Demo {
	void test() {
		System.out.println("Executing Test()........");
	}
}

class Sample extends Demo {
	void disp() {
		System.out.println("Executing Disp()........");
	}
}

public class MainClass1 {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.test();

		Sample s = new Sample();
		s.test();
		s.disp();
	}
}
