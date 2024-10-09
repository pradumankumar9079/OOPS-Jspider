package com.jspider.methodoverloading;

class Irctc {
	void search(int trainNumbers) {
		System.out.println("Search With Train Numbers: ");
	}

	void search(String src, String dest) {
		System.out.println("Search With Src,dest ");
	}

	void search(long pnr) {
		System.out.println("Search With pnr");
	}

}

public class IrctcSearchExample2 {
	public static void main(String[] args) {
		Irctc ref = new Irctc();
		ref.search(24545);
		ref.search("BLR", "PUNE");
		ref.search(3245465l);
	}
}
