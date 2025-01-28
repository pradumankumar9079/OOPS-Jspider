package dsaday9;

public class LLRunner {
	public static void main(String[] args) {
		LinkedListExample ll = new LinkedListExample();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(40);
		ll.insert(50);
		ll.insert(60);
		ll.insert(70);
		ll.insert(80);
		ll.display();
		ll.insert(8);
		ll.display();
		ll.delete();
		ll.display();
		ll.deleteFront();
		ll.display();
//		ll.deleteSpecific(20);
		ll.insertFront(5);
		ll.insertFront(10);
		ll.display();

	}
}
