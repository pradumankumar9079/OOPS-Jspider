package com.jspider.polymorphism7;

class Irctc {
	void search(int trainNumber) {
		System.out.println("Train Schedule");
	}

	void search(String src, String dest) {
		System.out.println("List of Trains");
	}

	void search(String pnr) {
		System.out.println("Ticket Details");
	}
}

public class MainClass2 {
	public static void main(String[] args) {
		Irctc obj = new Irctc();
		obj.search(12061);
		obj.search("KSR", "MAS");
		obj.search("J1223445");
	}
}
