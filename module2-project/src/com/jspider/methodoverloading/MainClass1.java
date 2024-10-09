package com.jspider.methodoverloading;

// Real Life Flipkart Example Payment option like cod,card,upi,netbanking
class Flipkart {
	void payment() {
		System.out.println("COD");
	}

	void payment(long card) {
		System.out.println("CARD");
	}

	void payment(String upi) {
		System.out.println("UPI");
	}

	void payment(String un, String Pass) {
		System.out.println("Netbanking");
	}
}

public class MainClass1 {
	public static void main(String[] args) {
		Flipkart obj = new Flipkart();
		obj.payment();
		obj.payment(34576876654576L);
		obj.payment("Raja@SBI");
		obj.payment("Raj", "9079");
	}
}