package com.jspider.fullabstractionusinginterface2;

interface Delta {
	void play();

	void disp();
}

class Example implements Delta {

	@Override
	public void play() {
		System.out.println("Executing Play()...");
	}

	@Override
	public void disp() {
		System.out.println("Executing disp()...");
	}

}

public class MainClass2 {
	public static void main(String[] args) {
		Delta ref = new Example();
		ref.play();
		ref.disp();
	}
}
//Executing Play()...
//Executing disp()...
