package com.jspider.extraslikethissuper;

// super class point 1 refer note
// this and super mixup
class Alpha {
	int val = 25;
}

class Sample extends Alpha {
	int val = 50;

	void play() {
		int val = 75;
		System.out.println(super.val);// 25
		System.out.println(this.val); // 50
		System.out.println(val);// 75
	}
}

public class MainClass1super {
	public static void main(String[] args) {
		Sample s = new Sample();
		s.play();

		/************ Different Concept focus once **********************/
		Alpha a = new Sample();// upcasting Sample val hidden
		// it's not like method we will not get latest implementation
		// to identify what we will get follow L.H.S part
		System.out.println(a.val);
		/**************************************/
	}
}
