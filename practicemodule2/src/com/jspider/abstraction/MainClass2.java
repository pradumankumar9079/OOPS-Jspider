package com.jspider.abstraction;

@FunctionalInterface
interface Alpha {
	int a = 1;

	void m1();
}

class Beta implements Alpha {

	@Override
	public void m1() {
		System.out.println("Beta");
	}

}

public class MainClass2 {
	public static void main(String[] args) {
		Alpha ref = new Beta();
		ref.m1();
		System.out.println(ref.a);
	}
}
