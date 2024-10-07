package com.jspider.typecastingnonprimitive2;

// we will use this in Advance Javca
class Fruit {

}

class Apple extends Fruit {

}

class Mango extends Fruit {

}

class Grape extends Fruit {

}

// we are going to market or going online and adding to cart
class FruitBasket {
	// Adding All the Fruit in same cart
	// i want to this method to support all the product
	static void addToBasket(Fruit obj) {
		if (obj != null) {
			System.out.println("Fruit Added: ");
		}
	}
}

public class MainClass5 {
	public static void main(String[] args) {
		Apple a = new Apple();
		FruitBasket.addToBasket(a); // Internally Upcasting: Apple-->Fruit

		Mango m = new Mango();
		FruitBasket.addToBasket(m); // Internally Upcasting: Mango-->Fruit

		Grape g = new Grape();
		FruitBasket.addToBasket(g); // Internally Upcasting: Grape-->Fruit

		FruitBasket.addToBasket(null);
	}
}
