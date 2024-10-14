package com.jspider.methodoverriding1;

class Father {
	void motorCycle() {
		System.out.println("Normal Splender");
	}
}

class Son extends Father {
	@Override
	void motorCycle() {
		System.out.println("Modified Splender");
	}
}

public class MainClass3 {
	public static void main(String[] args) {
		Father f = new Father();
		f.motorCycle();

		Son s = new Son();
		s.motorCycle();

		// after upcasting we will get latest implementation
		Father ref = new Son();
		ref.motorCycle();
	}
}
