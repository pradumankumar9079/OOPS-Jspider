package com.jspider.extraslikethissuper;

// validation purpose
class SoftwareV1 {
	void login() {
		System.out.println("Login with username or password");
	}
}

// now we need login as well as captcha
class SoftwareV2 extends SoftwareV1 {
	@Override
	void login() {
		super.login();
		System.out.println("Captcha Validation");
	}
}

public class MainClass2superRealLife {
	public static void main(String[] args) {
		SoftwareV1 v1 = new SoftwareV1();
		v1.login();

		SoftwareV2 v2 = new SoftwareV2();
		v2.login();
	}
}

//Login with username or password
//Login with username or password
//Captcha Validation
