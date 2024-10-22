package com.jspider.partialabstraction1;

// We Can't Create Object of abstract class
abstract class Demo {
	abstract void test();

	abstract void disp();
}

// for object creation purpose we are making concrete class
// it will give error so we will give or override definition with concrete method
class Sample extends Demo {

	@Override
	void test() {
		System.out.println("test()...");

	}

	@Override
	void disp() {
		System.out.println("disp()...");

	}

}

public class MainClass1 {
	public static void main(String[] args) {
		// Upcasting perform to use or access method
		Demo ref = new Sample();
		ref.test();
		ref.disp();
	}
}
//test()...
//disp()...
