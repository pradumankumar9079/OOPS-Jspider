package com.jspider.inheritance;

class WhatsApp1 {
	void message() {
		System.out.println("Send/Recieve Message");
	}
}

class WhatsApp2 extends WhatsApp1 {
	void call() {
		System.out.println("Audio/Video Call");
	}
}

class WhatsApp3 extends WhatsApp2 {
	void status() {
		System.out.println("Show Temp Photos");
	}
}

// MR--> Market Research to Develop New Feature
class WhatsApp4 extends WhatsApp3 {

}

public class WhatsApp {
	public static void main(String[] args) {
		WhatsApp1 w1 = new WhatsApp1();
		w1.message();

		WhatsApp2 w2 = new WhatsApp2();
		w1.message();
		w2.message();
		w2.call();

		WhatsApp3 w3 = new WhatsApp3();
		w3.message();
		w3.call();
		w3.status();

	}
}
