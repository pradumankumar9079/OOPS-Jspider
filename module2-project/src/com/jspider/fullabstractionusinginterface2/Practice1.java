package com.jspider.fullabstractionusinginterface2;

abstract class Geranimo {
	abstract void disp();
}

class Concrete extends Geranimo {
	@Override
	void disp() {
		System.out.println("This is Raja raj");
	}
}

public class Practice1 {
	public static void main(String[] args) {
		Geranimo g = new Concrete();
		g.disp();
	}
}
