package com.jspider.methodoverriding1;

class FacebookOld {
	void reaction() {
		System.out.println("Like");
	}
}

class FacebookNew extends FacebookOld {
	@Override
	void reaction() {
		System.out.println("Like,Wow,Sad,Angry,Haha,Love,Care");
	}
}

public class MainClass4 {
	public static void main(String[] args) {
		FacebookOld fbOld = new FacebookOld();
		fbOld.reaction();

		FacebookNew fbNew = new FacebookNew();
		fbNew.reaction();

		// UpCasting Print Latest Implementation
		FacebookOld fb = new FacebookNew();// C--P
		fb.reaction();

		// DownCasting We will get Same Latest Implementation
		FacebookNew fn = (FacebookNew) fb; // P--C
		fn.reaction();
	}
}
