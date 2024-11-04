package com.jspider.polymorphism;

class WhatsAppOldV1 {

	void message() {
		System.out.println("Message");
	}

	// Overload
	void message(int emoji) {
		System.out.println("Meassage, emoji");
	}

	void message(int emoji, String show) {
		System.out.println("Meassage, emoji");
	}
}

class WhatsAppOldV2 extends WhatsAppOldV1 {
	@Override
	void message(int emoji) {
		System.out.println("Message, VC,emoji");
	}
}

public class MainClass1 {
	public static void main(String[] args) {
		WhatsAppOldV2 v2 = new WhatsAppOldV2();
		v2.message(12);
	}
}
