package com.jspider.partialabstraction1;

// it's not compulsary to have abstract method in abstract class like atleast one 
abstract class Delta {
	void run() {
		System.out.println("Executing run()...");
	}

	void push() {
		System.out.println("Executing push()...");
	}
}

class Example extends Delta {

}

public class MainClass3 {
	public static void main(String[] args) {
		Delta ref = new Example();
		ref.run();
		ref.push();
	}
}

//Executing run()...
//Executing push()...
