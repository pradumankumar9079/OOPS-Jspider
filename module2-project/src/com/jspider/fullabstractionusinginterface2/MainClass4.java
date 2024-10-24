package com.jspider.fullabstractionusinginterface2;

// interface to interface extends
interface Apollo {
	void run();
}

interface Bravo extends Apollo {
	void push();
}

class Discovery implements Bravo {

	@Override
	public void run() {
		System.out.println("Executing run()...");
	}

	@Override
	public void push() {
		System.out.println("Executing push()...");
	}

}

public class MainClass4 {
	public static void main(String[] args) {
		Discovery ref = new Discovery();
		ref.run();
		ref.push();
	}
}
//Executing run()...
//Executing push()...