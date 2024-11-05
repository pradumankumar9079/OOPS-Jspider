package com.jspider.Object;

class Person {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Destroyed");
	}
}

public class FinalizeExample1 {
	public static void main(String[] args) {
		Person p = new Person();
		System.gc();
		System.out.println("-------------");
		p = null;
		System.gc();
	}
}
