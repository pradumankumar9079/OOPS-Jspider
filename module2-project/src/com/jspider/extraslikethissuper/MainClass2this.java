package com.jspider.extraslikethissuper;

// for second point of this refer note
class Geronimo {
	int num = 25;

	void test() {
		System.out.println("Executing test()...");
	}

	void disp() {
		System.out.println("Executing disp()...");

	}
}

public class MainClass2this {
	public static void main(String[] args) {
		Geronimo g = new Geronimo();
		g.disp();
	}
}
//Executing disp()...
