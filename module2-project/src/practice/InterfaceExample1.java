package practice;

interface Shape {
	void draw();
}

class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}
}

class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}

class ShapeToolkit {
	static void drawShape(Shape s) {
		if (s != null) {
			s.draw();
		}
	}
}

public class InterfaceExample1 {
	public static void main(String[] args) {
		ShapeToolkit.drawShape(new Circle());
		ShapeToolkit.drawShape(new Rectangle());
	}
}
