package com.jspider.typecastingnonprimitive2;
// In big Billion Days buying a lot item from app and adding into cart

class Product {

}

class Shoes extends Product {

}

class Mobile extends Product {

}

class Television extends Product {

}

class Notebook extends Product {

}

// This is My Application We will Add in cart and we can also show (toast message-->Built In Method for this later on)
class Flipkart {
	// i need to add all type of Product that's why taking Product p
	// javac will upcast while assigning Product like: Shoes,Mobile,Television
	static void addToKart(Product p) {
		if (p != null) {
			System.out.println("Item Added into Kart");
		}
	}
}

public class FlipKartExample {
	public static void main(String[] args) {
		Shoes s = new Shoes();
		Flipkart.addToKart(s);// Internally Upcasted Shoes to Product

		Mobile m = new Mobile();
		Flipkart.addToKart(m);

		Television t = new Television();
		Flipkart.addToKart(t);

		Notebook n = new Notebook();
		Flipkart.addToKart(n);
	}

}
