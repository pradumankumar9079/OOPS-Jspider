package com.jspider.inheritance;

//Hierarchical
class M {
	void test() {
		System.out.println("Executing Test()........");
	}
}

class N extends M {
	void disp() {
		System.out.println("Executing Disp()........");
	}
}

class O extends M {
	void play() {
		System.out.println("Executing Play().........");
	}
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		M m1 = new M();
		m1.test();

		N n1 = new N();
		n1.test();
		n1.disp();

		O o1 = new O();
		o1.test();
		o1.play();
//		o1.disp(); --> Not Possible
	}
}
