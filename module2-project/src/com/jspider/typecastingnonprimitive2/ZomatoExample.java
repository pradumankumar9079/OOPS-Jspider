package com.jspider.typecastingnonprimitive2;

class Food {

}

class Biryani extends Food {

}

class MasalaDosa extends Food {

}

class Pizza extends Food {

}

class Zomato {
	static void addToKart(Food obj) {
		if (obj != null) {
			System.out.println("Added to Kart");
		}
	}
}

public class ZomatoExample {
	public static void main(String[] args) {
		Biryani b = new Biryani();
		Zomato.addToKart(b);

		MasalaDosa m = new MasalaDosa();
		Zomato.addToKart(m);

		Pizza p = new Pizza();
		Zomato.addToKart(p);

	}
}
