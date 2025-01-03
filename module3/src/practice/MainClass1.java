package practice;

class A extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
//			System.out.println(i);
			Thread th = Thread.currentThread();
			System.out.println("ID: " + th.getId() + "Name: " + th.getName() + "Priority: " + th.getPriority());
		}
	}

	public void test() {
		for (int i = 11; i <= 20; i++) {
			Thread th = Thread.currentThread();
			System.out.println("ID: " + th.getId() + "Name: " + th.getName() + "Priority: " + th.getPriority());
//			System.out.println();
		}
	}
}

public class MainClass1 {
	public static void main(String[] args) {
		A ref = new A();
		Thread th = new Thread(ref);
		th.start();
		th.setName("Raja ");
		th.setPriority(10);

		ref.test();
	}
}
