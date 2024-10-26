package com.jspider.extraslikethissuper;

//for third point of this keyword access note
class Student {
	String name;
	int id;

	Student(String name, int id) {
		// name which i am assigning will act like a local variable
		this.name = name;
		this.id = id;
	}
}

// For Better Understanding
class Hello {
	int a = 10;

	void test() {
		int a = 20;
		System.out.println(a);// 20
		System.out.println(this.a);// 10
	}
}

public class MainClass3this {
	public static void main(String[] args) {
		Student s1 = new Student("Ravi", 101);
		Hello h1 = new Hello();
		h1.test();
	}
}
//20
//10
