package com.jspider.BeanPojoclass;

import java.io.Serializable;

//in java bean class which is pojo class i am implementing Serializable
class Credentials implements Serializable {
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

public class CredentialsMainClass4 {
	public static void main(String[] args) {
		Credentials c1 = new Credentials();
		c1.setUsername("Raja raj");// present in read.java
		c1.setPassword("Raja@9079");// present in read.java

		// Data Transfer using Object(DTO)
		System.out.println("Name is: " + c1.getUsername());// present in verify.java
		System.out.println("Password is: " + c1.getPassword());// present in verify.java
	}
}
