package practice;

abstract class HotStar {
	void login() {

	}

	abstract void view();
}

class HotStarFree extends HotStar {
	void view() {
		System.out.println("Ad,Trailer");
	}
}

class HotStarVip extends HotStar {
	void view() {
		System.out.println("Ad,Content");
	}
}

class HotStarPremium extends HotStar {
	void view() {
		System.out.println("No Ad,All Access");
	}
}

public class MainClass1 {
	public static void main(String[] args) {
		HotStar hs;
		hs = new HotStarPremium();
		hs.login();
		hs.view();

		hs = new HotStarVip();
		hs.login();
		hs.view();

		hs = new HotStarFree();
		hs.login();
		hs.view();
	}
}
