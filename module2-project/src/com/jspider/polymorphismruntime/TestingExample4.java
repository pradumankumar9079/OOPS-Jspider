package com.jspider.polymorphismruntime;

class TestEngineer {
	void test() {
		System.out.println("Testing");
	}
}

class ManualTestEngineer extends TestEngineer {
	@Override
	void test() {
		System.out.println("Test Case Execution");
	}
}

class AutomationTestEngineer extends TestEngineer {
	@Override
	void test() {
		System.out.println("Test Script Execution");
	}
}

public class TestingExample4 {
	public static void main(String[] args) {
		TestEngineer sdet;
		sdet = new ManualTestEngineer();
		sdet.test();// first time decision taken to bind with Manual

		sdet = new AutomationTestEngineer();
		sdet.test();// Now Decision Change So it's Dynamic
	}
}
//Test Case Execution
//Test Script Execution
