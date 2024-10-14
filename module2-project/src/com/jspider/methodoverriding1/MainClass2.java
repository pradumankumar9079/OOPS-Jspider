package com.jspider.methodoverriding1;

class Parent {
	void marriage() {
		System.out.println("Arrange Marriage: ");
	}
}

class Child extends Parent {
	// Annotation --> it will tell to compiler and programmer what to do
	// Implementation of marriage or definition
	@Override
	void marriage() {
		System.out.println("Love Marriage: ");
	}
}

public class MainClass2 {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.marriage();

		Child c = new Child();
		c.marriage();

		Parent ref = new Child();
		ref.marriage();

	}
}
