package com.jspider.test;

class Paytm {
	Paytm() {
		System.out.println("Paytm Opened");
	}

	Paytm(int a) {
		System.out.println("Paytm Closed");
	}
}

public class ConstructorTesting {
	public static void main(String[] args) {
		Paytm p = new Paytm();
		// p.Paytm(10);// Can't do it Create new Object With int Argument
	}
}
