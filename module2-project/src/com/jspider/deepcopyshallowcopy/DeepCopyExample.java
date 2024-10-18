package com.jspider.deepcopyshallowcopy;

class Delta {
	int val;
}

public class DeepCopyExample {
	public static void main(String[] args) {
		// Deep Copy
		Delta ref1 = new Delta();
		Delta ref2 = new Delta();

		ref1.val = 1;
		System.out.println(ref1.val);

		System.out.println(ref2.val);

		// Shallow Copy
		Delta ref3 = new Delta();
		Delta ref4 = ref3;

		ref3.val = 3;
		System.out.println(ref3.val);
		System.out.println(ref4.val);
	}
}
