package com.jspider.constructors;

class Amazon{
	Amazon(){	
	System.out.println("Normal Amazon Account : Shopping");	
}
	
	Amazon(double fees){	
		System.out.println("Prime Amazon Account : Shopping, Videos, Music");
}
	
	
}
public class MainClass1 {
	public static void main(String[] args) {
		// Why to use point 1
		// Creating Two object of same class with different capabilities
		Amazon a1 = new Amazon();//1--->Normal
		Amazon a2 = new Amazon(999);//2-->Prime
		
	
}
}
