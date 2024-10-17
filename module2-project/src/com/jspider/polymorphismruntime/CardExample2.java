package com.jspider.polymorphismruntime;

class Card {
	void swipe() {
		System.out.println("Please Wait");
	}
}

class DebitCard extends Card {
	@Override
	void swipe() {
		System.out.println("Account Balance Reduces");
	}
}

class CreditCard extends Card {
	@Override
	void swipe() {
		System.out.println("Credit Due increases");
	}
}

public class CardExample2 {
	public static void main(String[] args) {
		// JVM check in method table check for method execution plan
		// not present go inside instance and than determine which card swiped
		// late binding this thing happen during execution
		Card ref;
		ref = new DebitCard();// -->UpCasting DebitCard to Card
		ref.swipe();

		ref = new CreditCard();// -->UpCasting CreditCard to Card
		ref.swipe();
		// but overriding will take latest definition
	}
}
//Account Balance Reduces
