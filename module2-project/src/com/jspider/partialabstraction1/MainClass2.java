package com.jspider.partialabstraction1;

//in abstract we can write abstract and non abstract method both
// abstract is only method not variable it's error
abstract class Alpha {
	abstract void play();

	void send() {
		System.out.println("Executing send()...");
	}
}

//but override only abstract is necessary
class Beta extends Alpha {

	@Override
	void play() {
		System.out.println("Executing play()...");
	}

}

public class MainClass2 {
	public static void main(String[] args) {
		Alpha ref = new Beta();
		ref.send();
		ref.play();
	}
}

//Executing send()...
//Executing play()...
