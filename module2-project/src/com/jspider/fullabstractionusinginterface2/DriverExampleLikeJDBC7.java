package com.jspider.fullabstractionusinginterface2;

// for comment check last example
interface Driver {
	void connect();
}

class OracleDriver implements Driver {

	@Override
	public void connect() {
		System.out.println("Connected to Oracle");
	}
}

class Db2Driver implements Driver {

	@Override
	public void connect() {
		System.out.println("Connected to DB2");
	}

}

class MicrosoftDriver implements Driver {

	@Override
	public void connect() {
		System.out.println("Connected to Microsoft");
	}

}

class DriverManager {
	static void registerDriver(Driver ref) {
		if (ref != null)
			ref.connect();
	}
}

public class DriverExampleLikeJDBC7 {
	public static void main(String[] args) {
		// as a programmer i am writing one these two line
		// other came inbuilt or when we install oracle,db2,microsoft
		OracleDriver od = new OracleDriver();
		DriverManager.registerDriver(od);

		Db2Driver dbd = new Db2Driver();
		DriverManager.registerDriver(dbd);

		MicrosoftDriver md = new MicrosoftDriver();
		DriverManager.registerDriver(md);

	}
}

//Connected to Oracle
//Connected to DB2
//Connected to Microsoft
