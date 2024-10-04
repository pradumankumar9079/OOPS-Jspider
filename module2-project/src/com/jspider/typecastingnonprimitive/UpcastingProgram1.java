package com.jspider.typecastingnonprimitive;

class Demo {

}

class Sample extends Demo {

}

public class UpcastingProgram1 {
	public static void main(String[] args) {
		Sample obj = new Sample();
		Demo ref = obj;

		System.out.println(ref);
		System.out.println(obj);

		// Same Address only one Object Created
		// com.jspider.typecastingnonprimitive.Sample@15db9742
		// com.jspider.typecastingnonprimitive.Sample@15db9742

	}
}
