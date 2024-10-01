package com.jspider.inheritance;

class TestScriptV1 {
	void test() {
		System.out.println("Run Test");
	}
}

class TestScriptV2 extends TestScriptV1 {
	void log() {
		System.out.println("Record Results");
	}
}

class TestScriptV3 extends TestScriptV2 {
	void notifyDeveloper() {
		System.out.println("Notify");
	}
}

public class TestScript {
	public static void main(String[] args) {
		TestScriptV1 v1 = new TestScriptV1();
		v1.test();

		TestScriptV2 v2 = new TestScriptV2();
		v2.test();
		v2.log();
	}
}
