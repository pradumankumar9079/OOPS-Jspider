package com.jspider.Object;

public class Data implements Cloneable {
	double size;

	public static void main(String[] args) throws CloneNotSupportedException {
		Data obj = new Data();
		obj.size = 4.5;

		Data ref = (Data) obj.clone();
		System.out.println(ref.size);
	}
}
//4.5
