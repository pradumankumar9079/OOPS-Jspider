package com.jsp.company.MyFirstSpringProj;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("my_config.xml");

		// First Way
//		Student stu = (Student) factory.getBean("myStudent");
//		System.out.println(stu);

		// Second Way
		Student stu = factory.getBean("myStudent", Student.class);
		System.out.println(stu.getId());
		System.out.println(stu.getAge());
		System.out.println(stu.getName());
	}
}
