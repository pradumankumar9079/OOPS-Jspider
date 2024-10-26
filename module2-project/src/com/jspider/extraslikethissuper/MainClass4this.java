package com.jspider.extraslikethissuper;

// it will work for all non static context
// complete it              
class Demo {
	int a = 20;
	{
		System.out.println(this.a);
	}

	void disp() {
		System.out.println(this.a);
	}

	Demo() {
		System.out.println(this.a);
	}

}

public class MainClass4this {

}
