class C {

	int a = 20;
}

class D extends C {

	int b = 30;
}

public class MainClass3 {
	public static void main(String[] args) {
//		D obj = new D();
//		System.out.println(obj.b);
//		System.out.println(obj.a);

		System.out.println("--C obj2 = new D();//--------------------");

//		C obj2 = new C();
//		System.out.println(obj2.a);
//		System.out.println(obj2.b);
		C obj2 = new D();//
		D obj3 = (D) obj2;
		System.out.println(obj2.a);
		System.out.println(obj3.b);

	}
}
