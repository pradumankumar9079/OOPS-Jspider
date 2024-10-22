package com.jspider.partialabstraction1;

// go to note
// partial abstraction login exposed
abstract class HotStar {
	void login() {
		System.out.println("logged in...");
	}

	abstract void view();
}

class HotStarFree extends HotStar {

	@Override
	void view() {
		System.out.println("Ad,Trailer");
	}

}

class HotStarVip extends HotStar {

	@Override
	void view() {
		System.out.println("Ad,Regional Content");
	}

}

class HotStarPremium extends HotStar {

	@Override
	void view() {
		System.out.println("No Ad,All Access");
	}

}

public class HotStarExample4 {
	public static void main(String[] args) {
		HotStar hs;
		hs = new HotStarFree();
		hs.login();
		hs.view();

		hs = new HotStarVip();
		hs.login();
		hs.view();

		hs = new HotStarPremium();
		hs.login();
		hs.view();
	}
}
//logged in...
//Ad,Trailer
//logged in...
//Ad,Regional Content
//logged in...
//No Ad,All Access