package com.jspider.typecastingnonprimitive3downcasting;

class Demo {

}

class Sample extends Demo {

}

// Two Things Compulsary Upcasting and writing casting statement
// in upcasting and downcastig only one object created

public class MainClass1 {
	public static void main(String[] args) {
		Demo ref = new Sample();// firstly Upcasting
		Sample obj = (Sample) ref; // Than Downcasting

		System.out.println(ref);
		System.out.println(obj);

	}
}
