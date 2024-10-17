package com.jspider.polymorphismruntime;

// why it's Runtime Explained ? and why it's dynamic and late binding+
class Facebook {
	void display() {
		System.out.println("Display Response");
	}
}

class FacebookWeb extends Facebook {
	@Override
	void display() {
		System.out.println("Display in Browser");
	}
}

class FacebookMobile extends Facebook {
	@Override
	void display() {
		System.out.println("Display in Mobile");
	}
}

public class MainClass1 {
	public static void main(String[] args) {
// go to method table and ask for mep(method execution plan)
// but compiler confused with which display it has to give
// than jvm go to ref var and check what is present inside
// only in overriding amd upcasting mep not present
// Binding During Execution
		Facebook fb;
		fb = new FacebookWeb();
		fb.display();

		fb = new FacebookMobile();
		fb.display();
	}
}

//Display in Browser
//Display in Mobile
