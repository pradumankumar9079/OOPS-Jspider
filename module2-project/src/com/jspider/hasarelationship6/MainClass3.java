package com.jspider.hasarelationship6;

class Camera {
	void takePhoto() {
		System.out.println("Photo Clicked: ");
	}
}

class Airpods {
	void listen() {
		System.out.println("Listening to Audio: ");
	}
}

class Mobile {
	// Mobile HAS-A Camera is composition
	Camera cam = new Camera();

	// Mobile HAS-A Airpods is Aggregation
	Airpods ap = new Airpods();
}

public class MainClass3 {
	public static void main(String[] args) {
		Mobile mob = new Mobile();
		mob.cam.takePhoto();
		mob.ap.listen();
	}
}
