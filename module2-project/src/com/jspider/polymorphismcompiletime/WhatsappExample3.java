package com.jspider.polymorphismcompiletime;

// Dummy
class Audio {

}

class Video {

}

class Image {

}

class Whatsapp {
	void send(String s) {
		System.out.println("Text Message");
	}

	void send(Audio a) {
		System.out.println("Audio Message");
	}

	void send(Video v) {
		System.out.println("Video Message");
	}

	void send(Image i) {
		System.out.println("Image Message");
	}
}

public class WhatsappExample3 {
	public static void main(String[] args) {
		Whatsapp ref = new Whatsapp();
		ref.send("Hey");
		ref.send(new Audio());// ---> Passing Object
		ref.send(new Video());// ---> Passing Object
		ref.send(new Image());// ---> Passing Object

	}
}
