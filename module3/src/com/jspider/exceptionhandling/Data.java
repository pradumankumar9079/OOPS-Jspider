package com.jspider.exceptionhandling;

//throws Keyword Example 1 Throwing Single Exception
public class Data {
	double size;

	static void dataBackUp() throws CloneNotSupportedException {
		Data obj = new Data();
		obj.size = 4.5;
		Data ref = (Data) obj.clone();
		System.out.println(ref.size);

	}

	public static void main(String[] args) {
		try {
			dataBackUp();
		} catch (CloneNotSupportedException e) {
			System.out.println("Clone Falied");
		}
	}
}

//Clone Falied--> if class not implementing Cloneable
// Developer have to handle in main not throw it else we wil get Exception
