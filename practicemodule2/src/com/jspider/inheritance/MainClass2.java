package com.jspider.inheritance;

class Alpha {
	void funcAlPha() {
		System.out.println("Alpha");
	}
}

class Beta extends Alpha {
	void funcBeta() {
		System.out.println("Beta");
	}
}

class Gamma extends Beta {
	void funcGamma() {
		System.out.println("Gamma");
	}
}

class MainClass2 {
	public static void main(String[] args) {
		Alpha a = new Alpha();
		a.funcAlPha();

		Beta b = new Beta();
		b.funcAlPha();
		b.funcBeta();

		Gamma g = new Gamma();
		g.funcAlPha();
		g.funcBeta();
		g.funcGamma();
	}
}
