package com.jspider.methodoverriding1;

class GmailV1 {
	// Private method we can't override static and final
	void Compose() {
		System.out.println("Open New Tab in Browser");
	}
}

class GmailV2 extends GmailV1 {
	@Override
	void Compose() {
		System.out.println("Open Pop Up Box");
	}
}

public class GmailExample6 {
	public static void main(String[] args) {
		GmailV1 v1 = new GmailV1();
		v1.Compose();

		GmailV2 v2 = new GmailV2();
		v2.Compose();

		// UpCasting get Latest Implementation
		GmailV1 v3 = new GmailV1();
		v3.Compose();
	}
}
//Open New Tab in Browser
//Open Pop Up Box
//Open New Tab in Browser
