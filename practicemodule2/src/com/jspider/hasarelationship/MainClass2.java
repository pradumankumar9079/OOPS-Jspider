package com.jspider.hasarelationship;

class Camera {
	void funC() {
		System.out.println("Camera");
	}
}

class HeadPhone {
	void funcH() {
		System.out.println("HeadPhone");
	}
}

class Phone {
	void funcP() {
		System.out.println("Phone");
	}

	// Composition
	Camera c = new Camera();

	// Aggregation
	HeadPhone h = new HeadPhone();
}

public class MainClass2 {
	public static void main(String[] args) {
		Phone p = new Phone();

		p.c.funC();

		p.h.funcH();
	}
}
//Camera
//HeadPhone
