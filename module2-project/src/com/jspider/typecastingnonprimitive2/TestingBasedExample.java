package com.jspider.typecastingnonprimitive2;

class Element {

}

class Button extends Element {

}

class HyperLink extends Element {

}

class TextBox extends Element {

}

class TestScript {
	static void testElement(Element e) {
		if (e != null) {
			System.out.println("Element Tested...");
		}
	}
}

public class TestingBasedExample {
	public static void main(String[] args) {
		Button b = new Button();
		TestScript.testElement(b);

		HyperLink h = new HyperLink();
		TestScript.testElement(h);

		TextBox t = new TextBox();
		TestScript.testElement(t);

		TestScript.testElement(null);
	}

}
