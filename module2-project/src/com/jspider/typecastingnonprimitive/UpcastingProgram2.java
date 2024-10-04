package com.jspider.typecastingnonprimitive;

class Alpha {
	int a = 10;

	void test() {
		System.out.println("Executing test().........");
	}
}

class Beta extends Alpha {
	int b = 20;

	void disp() {
		System.out.println("Executing disp().........");
	}
}

public class UpcastingProgram2 {
	public static void main(String[] args) {
		Beta ref = new Beta();
		System.out.println(ref.a);
		ref.test();
		System.out.println(ref.b);
		ref.disp();

		// Upcasting
		Alpha obj = ref; // Beta-->Alpha
		System.out.println(obj.a);
		obj.test();

		// System.out.println(obj.b);// Not Possible Superclass is still not able to
		// Access Subclass Properties
		// obj.b;// Not possible

	}
}
