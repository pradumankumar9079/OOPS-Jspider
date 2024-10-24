package com.jspider.fullabstractionusinginterface2;

/******************* Declaration ***************************/
// Parent
// i don't need to change if i wanna add something into parent

interface Shape {
	void draw();
}

/**********************************************/

/******************* Definition ***************************/
class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square");
	}
}

class Triangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Triangle");
	}

}

/**********************************************/

/********************* Service Layer *************************/
class ShapeToolKit {
	static void drawShape(Shape s) {// here is abstraction
		if (s != null) {
			s.draw();// here polymorphism
		}
	}
}

/**********************************************/

/****************** Creating Object ****************************/
public class PaintExample5 {
	public static void main(String[] args) {
		Circle c = new Circle();
		ShapeToolKit.drawShape(c); // Upcasting

		Square s = new Square();
		ShapeToolKit.drawShape(s); // Upcasting

		Triangle t = new Triangle();
		ShapeToolKit.drawShape(t); // Upcasting

	}
}
/**********************************************/
//Circle
//Square
//Triangle
