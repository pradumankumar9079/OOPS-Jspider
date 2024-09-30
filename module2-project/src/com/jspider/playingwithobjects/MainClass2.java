package com.jspider.playingwithobjects;

import java.util.Scanner;

class Product {
	int pid;
	double price;

	Product(int pid, double price) {
		this.pid = pid;
		this.price = price;
	}
}

class ProductHelper {
	static Product CreateProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Pid: ");
		int id = sc.nextInt();
		System.out.println("Enter Price: ");
		double pr = sc.nextDouble();

		Product pro = new Product(id, pr);
		return pro;
	}

	static void displayProductInfo(Product p) {
		System.out.println("Pid " + p.pid);
		System.out.println("Price " + p.price);
	}
}

public class MainClass2 {
	public static void main(String[] args) {
		Product p1 = ProductHelper.CreateProduct(); // Returning Object
		ProductHelper.displayProductInfo(p1); // Passing Object

		System.out.println("-------------------------------");
		Product p2 = ProductHelper.CreateProduct();
		ProductHelper.displayProductInfo(p2);

	}
}
