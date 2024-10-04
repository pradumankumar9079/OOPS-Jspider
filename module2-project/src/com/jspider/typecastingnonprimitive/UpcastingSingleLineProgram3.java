package com.jspider.typecastingnonprimitive;

class Delta {
	void play() {
		System.out.println("Executing play()......");
	}
}

class Example extends Delta {
	void send() {
		System.out.println("Executing send()..........");
	}
}

public class UpcastingSingleLineProgram3 {
	public static void main(String[] args) {
// Upcasting in Single Line
		Delta ref = new Example(); // Upcasting : Example----->Delta
		ref.play();

		// when we are doing up casting child class properties get hidden from parent
		// that's why we can't access ref.send();
	}
}
