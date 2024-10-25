package com.jspider.BeanPojoclass;

import java.io.Serializable;

//in java bean class which is pojo class i am implementing Serializable                                                                                                                  
class Person implements Serializable {
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
