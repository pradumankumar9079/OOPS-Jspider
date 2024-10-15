package com.jspider.hasarelationship6;

class Printer {
	void write() {
		System.out.println("Executing write()...");
	}

	void write(int a) {
		System.out.println("Executing write (int)...");
	}
}

class Computer {
	// here ref is static object never static
	// ref is created in class area
	// object is created in heap area
	static Printer out = new Printer();
}

public class PrinterComputerLikeSysoutMainClass5 {
	public static void main(String[] args) {
		// this is looking like
//		System.out.println()
		Computer.out.write();
		Computer.out.write(10);
	}
}
