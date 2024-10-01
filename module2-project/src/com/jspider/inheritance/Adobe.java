package com.jspider.inheritance;

class AdobeFree {
	void read() {
		System.out.println("Reading");
	}
}

class AdobePaid extends AdobeFree {
	void write() {
		System.out.println("Writing");
	}

	void modify() {
		System.out.println("Modifying");
	}
}

public class Adobe {
	public static void main(String[] args) {
		AdobeFree af = new AdobeFree();
		af.read();

		AdobePaid ap = new AdobePaid();
		ap.read();
		ap.write();
		ap.modify();
	}
}
