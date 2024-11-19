package constructorchaining;

class Demo {
	Demo() {
		System.out.println("Demo() Constructor");
	}

	Demo(int a) {
		this();
		System.out.println("Demo(int) Constructor");
	}
}

class Sample extends Demo {
	Sample() {
		super(10);
		System.out.println("Sample() Constructor");
	}
}

public class MainClass1 {
	public static void main(String[] args) {
		Sample s = new Sample();
	}
}
