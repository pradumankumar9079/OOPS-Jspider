package com.jspider.pojoorbeaanclass;

class Person {
	private int age;

	public int getAge() {
		/*
		 * Authorization/validation
		 */
		return age;
	}

	public void setAge(int age) {
		/*
		 * Authorization/validation
		 */
		this.age = age;
	}
}

public class PersonMainClass1 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setAge(18);
		System.out.println(p1.getAge());
	}
}
