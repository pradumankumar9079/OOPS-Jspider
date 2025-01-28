package oops;

class Student1 {
	String name = "Raj";
}

class Student2 {
	String name = "Raj";

	@Override
	public String toString() {
		return name + " ";
	}

	@Override
	public int hashCode() {
		return 1;
	}
}

public class Object6 {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		System.out.println(s1.toString());
		System.out.println(s1.hashCode());

		Student2 s2 = new Student2();
		System.out.println(s2.toString());
		System.out.println(s2.hashCode());

	}
}
