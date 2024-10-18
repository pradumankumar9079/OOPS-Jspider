package com.jspider.encapsulation;

class Login {
	// Every member written inside class so it's Secure
	// Data Security is main goal
	// till than all program is example of encapsulation
	String username;
	int password;

	void verify() {
		System.out.println("Verified...");
	}

	void changePassword() {
		System.out.println("Password Changed...");
	}
}

public class MainClass1 {
	public static void main(String[] args) {
		Login l = new Login();
		l.verify();

	}
}
