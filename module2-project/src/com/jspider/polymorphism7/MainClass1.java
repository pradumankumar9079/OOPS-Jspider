package com.jspider.polymorphism7;

//-->Refer Note for extra point and understanding
class Flipkart {
	void payment() {
		System.out.println("COD");
	}

	void payment(long card) {
		System.out.println("Card: 20% Discount");
	}

	void payment(String upi) {
		System.out.println("Upi: 100 Rs Cashback");
	}
}

public class MainClass1 {
	public static void main(String[] args) {
		Flipkart flip = new Flipkart();
		flip.payment();
		flip.payment(234567687L);
		flip.payment("Raja@upi");

		// No change run 100 times that's why static PolyMorphism
		for (int i = 1; i <= 100; i++) {
			flip.payment();
		}
	}
}
