package com.jspider.hasarelationship6;

// Has a Example1
class Demo {
	void test() {
		System.out.println("Executing test()....");
	}
}

// Look at here no extends
// One Class is having Object of another class
// Some time it's composition or some time aggregation

// Mobile has a camera Composition(Strong Form Of association)
// Without Mobile Camera can't Survive
// Mobile has a Camera Composition

// Mobile has a Neck-band(Weak Form Of Association) 
// But  Without Mobile neck-band will survive
// Mobile has a neck-band --> Aggregation
class Sample {
	// and this is non static data member
	// We are not defining it inside any method
	Demo ref = new Demo();
}

public class MainClass1 {
	public static void main(String[] args) {
		Sample obj = new Sample();
		obj.ref.test();
	}
}
