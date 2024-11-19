package thread;

class B implements Runnable {

	@Override
	public void run() {
		System.out.println("Raja Bhai");
	}

}

public class MainClass2 {
	public static void main(String[] args) {
		B ref = new B();
		Thread th = new Thread(ref);
		th.start();
		System.out.println("Raja");
	}
}
