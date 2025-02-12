package practice;

class Demo {
	Demo() {
		System.out.println("this(non-parameterized)");
	}

	Demo(int a) {
		this();
		System.out.println("this(parameterized)");
	}
}

class Sample extends Demo {
	Sample() {
		super(10);
		System.out.println("Sub Class");
	}
}

public class ConstructorChainingExample {
	public static void main(String[] args) {
		Sample s = new Sample();
	}
}
