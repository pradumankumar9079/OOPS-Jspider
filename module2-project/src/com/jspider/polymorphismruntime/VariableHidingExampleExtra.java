package com.jspider.polymorphismruntime;

class Demo {
	int val = 30;
}

class Sample extends Demo {
	int val = 60;
}

// in case of method latest definition after upcasting
// in case of variable like in val = 30 go for upcasting result
// it's variable hiding
// Short Trick:
// in case of method look at RHS
// in case of variable look at LHS
public class VariableHidingExampleExtra {
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.val);

		Sample s = new Sample();
		System.out.println(s.val);

		Demo d1 = new Sample();
		System.out.println(d1.val);
	}
}

//30
//60
//30
