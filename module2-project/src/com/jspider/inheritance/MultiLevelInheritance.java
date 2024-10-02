package com.jspider.inheritance;

// MultiLevelInheritance
class X {
	void test() {
		System.out.println("Executing Test().........");
	}
}

class Y extends X {
	void disp() {
		System.out.println("Executing Disp().........");
	}
}

class Z extends Y {
	void play() {
		System.out.println("Executing Play().........");
	}
}

public class MultiLevelInheritance {
	public static void main(String[] args) {
		X x1 = new X();
		x1.test();

		Y y1 = new Y();
		y1.test();
		y1.disp();

		Z z1 = new Z();
		z1.test();
		z1.disp();
		z1.play();
	}
}
