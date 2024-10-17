package com.jspider.polymorphismruntime;

class Watch {
	void function() {
		System.out.println();
	}
}

class AnalogWatch extends Watch {
	@Override
	void function() {
		System.out.println("Display Date & Time");
	}
}

class SmartWatch extends Watch {
	@Override
	void function() {
		System.out.println("Display Date,Time & Notification");
	}
}

public class WatchExample3 {
	public static void main(String[] args) {
		// did override so mep is not there
		// here jvm go to method table and ask for mep
		// but mep is not there
		// so during runtime it will check for instance present inside ref
		// so it's late binding or dynamic
		Watch obj;
		obj = new AnalogWatch();
		obj.function();

		obj = new SmartWatch();
		obj.function();

	}
}
//Display Date & Time
//Display Date,Time & Notification
