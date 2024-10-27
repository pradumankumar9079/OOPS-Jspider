package com.jspider.thiskeyword;

// this keyword can be used only inside non static context
class A {
	int a = 20;
	{
		// this keyword is used to access the non static members of current class

		this.a = 30;
		System.out.println(a);
	}

	void disp(int a) {
		// we can use this keyword to differentiate between local variable and data
		// members of the current class
		this.a = a;
		System.out.println(this);
		// this keyword is used to refer to the current instance of a class
		System.out.println(a);
	}

	A() {
		System.out.println(this.a);
	}
}

public class MainClass1 {
	public static void main(String[] args) {
		System.out.println("This is Riya raj");
		A ref = new A();
		ref.disp(50);
	}
}
