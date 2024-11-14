package thissuper;

class A {
	int a = 10;

	void m1() {
		System.out.println(this);
	}
}

class B extends A {
	int b = 20;
}

public class MainClass1 {
	public static void main(String[] args) {
		A ref1 = new A();
		ref1.m1();
		System.out.println(ref1);

		A ref2 = new A();
		ref2.m1();
		System.out.println(ref2);
	}
}
