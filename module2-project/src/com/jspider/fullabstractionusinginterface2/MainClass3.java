package com.jspider.fullabstractionusinginterface2;

// Multiple Inheritance Example
// Java Support Multiple Inheritance
// No to class yes to interface because it's not reusable in interface
// and interface is not having constructor
interface Alpha {
	void test();
}

interface Beta {
	void send();
}

class Gamma implements Alpha, Beta {

	@Override
	public void send() {
		System.out.println("Executing Send()...");
	}

	@Override
	public void test() {
		System.out.println("Executing test()...");
	}

}

public class MainClass3 {
	public static void main(String[] args) {
		// here not doing upcasting because without upcasting we can access both
		// otherwise do two times upcasting and than access
		Gamma ref = new Gamma();
		ref.send();
		ref.test();

	}
}
//Executing Send()...
//Executing test()...
