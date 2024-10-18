package com.jspider.encapsulation;

// start of 2
// do it by urself
//2_1
class Karnataka2_1 {
	private static void test() {
		System.out.println("Executing test()...");
	}

	static void disp() {
		System.out.println("Executing disp()...");
	}

	protected static void play() {
		System.out.println("Executing play()...");
	}

	public static void send() {
		System.out.println("Executing send()...");
	}

	public static void main(String[] args) {
		Karnataka2_1.test();
		Karnataka2_1.disp();
		Karnataka2_1.play();
		Karnataka2_1.send();

	}
}
