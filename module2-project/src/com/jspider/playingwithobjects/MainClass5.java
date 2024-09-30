package com.jspider.playingwithobjects;

import java.util.Scanner;

class Briyani {
	int qty;
	double price;

	Briyani(int qty, double price) {
		this.qty = qty;
		this.price = price;
	}
}

class BriyaniHotel {
	static Briyani createBriyani() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter qty: ");
		int qty = scn.nextInt();

		System.out.println("Enter price: ");
		double price = scn.nextDouble();

		Briyani br = new Briyani(qty, price);
		return br;
	}

	static void serveBriyani(Briyani br) {
		System.out.println("Qty is: " + br.qty);
		System.out.println("Price is: " + br.price);
	}
}

public class MainClass5 {
	public static void main(String[] args) {
		Briyani b1 = BriyaniHotel.createBriyani();
		BriyaniHotel.serveBriyani(b1);
	}
}
