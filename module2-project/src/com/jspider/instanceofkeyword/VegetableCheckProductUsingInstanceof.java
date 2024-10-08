package com.jspider.instanceofkeyword;

// Ordering from Zepto and identifying product type using instance of
class Vegetable {

}

class Potato extends Vegetable {

}

class Coriander extends Vegetable {

}

class Lemon extends Vegetable {

}

class Zepto {
	static void buyVegetable(Vegetable v) {
		if (v instanceof Potato) {
			System.out.println("Potato in Kg");
		} else if (v instanceof Coriander) {
			System.out.println("Coriander in Bundle");
		} else if (v instanceof Lemon) {
			System.out.println("Lemon in Pieces");
		}
	}
}

public class VegetableCheckProductUsingInstanceof {
	public static void main(String[] args) {
		Zepto.buyVegetable(new Potato());
		Zepto.buyVegetable(new Coriander());
		Zepto.buyVegetable(new Lemon());
	}
}
