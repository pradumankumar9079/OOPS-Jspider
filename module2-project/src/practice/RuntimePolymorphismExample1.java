package practice;

class Animal {
	void noise() {
		System.out.println("Making Noise");
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
		System.out.println("bow...bow");
	}
}

class AnimalSimulator {
	static void makeNoise(Animal a) {
		if (a != null) {
			a.noise();
		}
	}
}

public class RuntimePolymorphismExample1 {
	public static void main(String[] args) {
		AnimalSimulator.makeNoise(new Cat());
		AnimalSimulator.makeNoise(new Dog());
	}
}
