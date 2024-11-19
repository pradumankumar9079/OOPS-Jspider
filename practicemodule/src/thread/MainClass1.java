package thread;

class A extends Thread {
	@Override
	public void run() {
		System.out.println("Raja raj");
	}
}

public class MainClass1 {
	public static void main(String[] args) {
		A ref = new A();
		ref.start();
		System.out.println("Riya raj");
	}
}
