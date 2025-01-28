package oops;

//== for primitives: Compares actual values.
//== for objects: Compares memory addresses (reference equality).
//Use .equals() for object content comparison (when overridden).

class Circle {
	int radius = 5;

	@Override
	public boolean equals(Object obj) {
		Circle c = (Circle) obj;
		return this.radius == c.radius;
	}
}

public class Object7 {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		System.out.println(c1 == c2);

		System.out.println(c1.equals(c2));
	}
}
