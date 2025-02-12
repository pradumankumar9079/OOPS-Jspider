package practice;

import java.io.Serializable;

// Java Bean Class Example(100% Encapsulation)
class Person implements Serializable {
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class JavaBeanClass {
	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(20);
		System.out.println(p.getAge());

	}
}
