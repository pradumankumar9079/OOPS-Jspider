package com.jspider.fullabstractionusinginterface2;

abstract class Animal {
	void noise() {
		System.out.println();
	}
}

class Cat extends Animal {
	@Override
	void noise() {
		System.out.println("meow...meow");
	}
}

class Dog extends Animal {
	@Override
	void noise() {
		System.out.println("Bow...Bow");
	}
}

class AnimalSimulator {
	static void makeNoise(Animal a) {
		if (a != null) {
			a.noise();
		}
	}
}

public class RuntimePolymorphismP {
	public static void main(String[] args) {
		AnimalSimulator.makeNoise(new Cat());
		AnimalSimulator.makeNoise(new Dog());
		AnimalSimulator.makeNoise(null);
	}
}
