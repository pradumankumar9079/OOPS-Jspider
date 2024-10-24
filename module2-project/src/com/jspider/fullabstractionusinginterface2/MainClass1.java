package com.jspider.fullabstractionusinginterface2;
// pure abstraction

// Interface Started

/****************************************************** */
// Default behaviour of interface
// ❯ javap Demo;
// Compiled from "MainClass1.java"
// interface Demo {
//   public static final int res;
//   public abstract void test();
// }
// ❯ 
/***************************************************** */

interface Demo {
//	and variable is default public static final
//	int a = 0;

	void test();// By default it's public abstract
	// Clarify abstract is not having constructor
	// it's not available and allowed
}

class Sample implements Demo {// for interface use implement instead of extends

	// abstract method should be public here because
	// in interface it's public abstract by default
	@Override
	public void test() {
		System.out.println("Executing test()...");
	}

}

public class MainClass1 {
	public static void main(String[] args) {
		// UpCasting
		Demo ref = new Sample();
		ref.test();
	}
}
//Executing test()...
