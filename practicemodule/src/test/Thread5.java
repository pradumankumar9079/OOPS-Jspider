package test;

//class Demo extends Thread {
//	@Override
//	public void run() {
//		for (int i = 0; i <= 10; i++) {
//			System.out.println("Raja raj");
//		}
//	}
//
//}

class Demo implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Raja raj");
		}
	}

}

public class Thread5 {
	public static void main(String[] args) {
		Demo d = new Demo();
//		d.start();
		Thread th = new Thread(d);
		th.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println("Aliya");
		}
	}
}
