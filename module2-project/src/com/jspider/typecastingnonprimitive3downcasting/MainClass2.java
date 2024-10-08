package com.jspider.typecastingnonprimitive3downcasting;

class Delta {
	void run() {
		System.out.println("Executing run()...");
	}
}

class Example extends Delta {
	void send() {
		System.out.println("Executing send()...");
	}
}

public class MainClass2 {
	public static void main(String[] args) {
		Delta d = new Example();// Upcasting
		d.run();

		Example e = (Example) d;// Downcasting
		e.run();
		e.send();
	}
}
