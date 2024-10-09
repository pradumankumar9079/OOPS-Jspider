package com.jspider.methodoverloading;

class Facebook {
	void login(String email, String id) {
		System.out.println("Login with Email,id");
	}

	void login(long mobile, String pass) {
		System.out.println("Login with Phone,pass");
	}
}

public class FacebookLoginExampleMultipleWay3 {
	public static void main(String[] args) {
		Facebook fb = new Facebook();
		fb.login("Raja@gmail", "raja");
		fb.login(9079213789l, "raja");
	}
}
