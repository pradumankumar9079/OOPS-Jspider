package com.jspider.methodoverriding1;

// Multilevel Example
class Whatsapp1 {
	void deliveryReport() {
		System.out.println("Sent");
	}
}

class Whatsapp2 extends Whatsapp1 {
	@Override
	void deliveryReport() {
		System.out.println("Sent Delivered");
	}
}

class Whatsapp3 extends Whatsapp2 {
	@Override
	void deliveryReport() {
		System.out.println("Sent Delivered Seen");
	}
}

public class WhatsAppExample5 {
	public static void main(String[] args) {
		// in all case get latest implementation accordingly
		// Do this
//		Whatsapp1 w1_1 = new Whatsapp1();
//		w1_1.deliveryReport();
//
//		Whatsapp1 w1_2 = new Whatsapp2();
//		w1_2.deliveryReport();
//
//		Whatsapp1 w1_3 = new Whatsapp3();
//		w1_3.deliveryReport();

		// or we can reinitialize w1_1
		// or this -->Same Output in both
		Whatsapp1 w1_1 = new Whatsapp1();
		w1_1.deliveryReport();

		w1_1 = new Whatsapp2();
		w1_1.deliveryReport();

		w1_1 = new Whatsapp3();
		w1_1.deliveryReport();

	}
}

//Sent
//Sent Delivered
//Sent Delivered Seen
