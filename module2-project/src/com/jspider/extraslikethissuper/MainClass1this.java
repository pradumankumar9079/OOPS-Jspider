package com.jspider.extraslikethissuper;

// this point one refer from note
class Utility {
	void test() {
		// same address 1
		// same address 1
		System.out.println(this);
	}
}

public class MainClass1this {
	public static void main(String[] args) {
		Utility u1 = new Utility();
		// same address 1
		System.out.println(u1);
		u1.test();

		Utility u2 = new Utility();
		// same address 2
		System.out.println(u2);
		u2.test();
	}
}
//com.jspider.extraslikethissuper.Utility@76ccd017
//com.jspider.extraslikethissuper.Utility@76ccd017
//com.jspider.extraslikethissuper.Utility@7637f22
//com.jspider.extraslikethissuper.Utility@7637f22
