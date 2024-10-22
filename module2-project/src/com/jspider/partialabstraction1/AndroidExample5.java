package com.jspider.partialabstraction1;

abstract class Android {
	void call() {
		System.out.println("Calling()...");
	}

	void message() {
		System.out.println("Message send...");
	}

	abstract void ui();
}

class Samsung extends Android {

	@Override
	void ui() {
		System.out.println("Galaxy OS");
	}

}

class Redmi extends Android {

	@Override
	void ui() {
		System.out.println("MIUI");
	}

}

class OnePlus extends Android {

	@Override
	void ui() {
		System.out.println("Oxygen OS");
	}

}

public class AndroidExample5 {
	public static void main(String[] args) {
		Android a;
		a = new Samsung();
		a.ui();

		a = new Redmi();
		a.ui();

		a = new OnePlus();
		a.ui();
	}
}
//Galaxy OS
//MIUI
//Oxygen OS
