class F {
	int s = 10;

}

class G extends F {
	int t = 50;
}

public class Hiding {

	public static void main(String[] args) {

//		F obj1 = new G();
//		G obj2 = (G) obj1;
//		
//		
//		System.out.println(obj2.t + " " + obj2.s);

		int a = 20;
		double b = a;
		System.out.println(b);

		double c = 20.9876;
		System.out.println(c);
		int d = (int) c;
		System.out.println(d);

	}

}
